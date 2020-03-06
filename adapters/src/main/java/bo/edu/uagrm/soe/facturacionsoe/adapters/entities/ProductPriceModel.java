package bo.edu.uagrm.soe.facturacionsoe.adapters.entities;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product_prices", schema = "public", catalog = "facturacion-soe")
public class ProductPriceModel extends ProductPrice<ProductModel> {
    public ProductPriceModel() {
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
    @Column(name = "amount")
    public Double getAmount() {
        return super.getAmount();
    }

    @Override
    @Basic
    @Column(name = "start_timestamp")
    public Timestamp getStartTimestamp() {
        return super.getStartTimestamp();
    }

    @Override
    @Basic
    @Column(name = "end_timestamp")
    public Timestamp getEndTimestamp() {
        return super.getEndTimestamp();
    }

    @Override
    @Basic
    @Column(name = "is_active")
    public Boolean getActive() {
        return super.getActive();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPriceModel that = (ProductPriceModel) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getAmount(), that.getAmount()) &&
                Objects.equals(getStartTimestamp(), that.getStartTimestamp()) &&
                Objects.equals(getEndTimestamp(), that.getEndTimestamp()) &&
                Objects.equals(getActive(), that.getActive());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAmount(), getStartTimestamp(), getEndTimestamp(), getActive());
    }

    @Override
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    public ProductModel getProduct() {
        return super.getProduct();
    }
}
