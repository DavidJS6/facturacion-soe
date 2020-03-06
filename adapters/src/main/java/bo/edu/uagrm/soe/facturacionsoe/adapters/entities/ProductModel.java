package bo.edu.uagrm.soe.facturacionsoe.adapters.entities;

import bo.edu.uagrm.soe.facturacionsoe.entities.InvoiceItem;
import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "products", schema = "public", catalog = "facturacion-soe")
public class ProductModel extends Product<InvoiceItemModel, ProductPriceModel> {
    /*private Collection<InvoiceItemModel> invoiceItemList;
    private Collection<ProductPriceModel> productPriceList;*/

    public ProductModel() {
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
    @Column(name = "code")
    public String getCode() {
        return super.getCode();
    }

    @Override
    @Basic
    @Column(name = "name")
    public String getName() {
        return super.getName();
    }

    @Override
    @Basic
    @Column(name = "description")
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductModel productModel = (ProductModel) o;
        return Objects.equals(getId(), productModel.getId()) &&
                Objects.equals(getCode(), productModel.getCode()) &&
                Objects.equals(getName(), productModel.getName()) &&
                Objects.equals(getDescription(), productModel.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCode(), getName(), getDescription());
    }

    /*public void setInvoiceItemList(Collection<InvoiceItemModel> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }*/

    @Override
    @OneToMany(mappedBy = "product")
    @JsonIgnore
    public Collection<InvoiceItemModel> getInvoiceItemList() {
        return super.getInvoiceItemList();
    }

    /*public void setProductPriceList(Collection<ProductPriceModel> productPriceList) {
        this.productPriceList = productPriceList;
    }*/

    @Override
    @OneToMany(mappedBy = "product")
    @JsonIgnore
    public Collection<ProductPriceModel> getProductPriceList() {
        return super.getProductPriceList();
    }

}
