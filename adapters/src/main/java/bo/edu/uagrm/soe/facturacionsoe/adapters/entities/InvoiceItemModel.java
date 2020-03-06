package bo.edu.uagrm.soe.facturacionsoe.adapters.entities;

import bo.edu.uagrm.soe.facturacionsoe.entities.InvoiceItem;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "invoice_items", schema = "public", catalog = "facturacion-soe")
public class InvoiceItemModel extends InvoiceItem<InvoiceModel, ProductModel> {
    /*private InvoiceModel invoice;
    private ProductModel product;*/

    public InvoiceItemModel() {
        super();
    }

    @Override
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return super.getId();
    }

    @Override
    @Basic
    @Column(name = "unit_price")
    public Double getUnitPrice() {
        return super.getUnitPrice();
    }

    @Override
    @Basic
    @Column(name = "quantity")
    public Double getQuantity() {
        return super.getQuantity();
    }

    @Override
    @Basic
    @Column(name = "item_amount")
    public Double getItemAmount() {
        return super.getItemAmount();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceItemModel that = (InvoiceItemModel) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getUnitPrice(), that.getUnitPrice()) &&
                Objects.equals(getQuantity(), that.getQuantity()) &&
                Objects.equals(getItemAmount(), that.getItemAmount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUnitPrice(), getQuantity(), getItemAmount());
    }

    @ManyToOne
    @JoinColumn(name = "invoice_id", referencedColumnName = "id", nullable = false)
    public InvoiceModel getInvoice() {
        return super.getInvoice();
    }

    @Override
    public void setInvoice(InvoiceModel invoice) {
        super.setInvoice(invoice);
    }

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    public ProductModel getProduct() {
        return super.getProduct();
    }

    @Override
    public void setProduct(ProductModel product) {
        super.setProduct(product);
    }
}
