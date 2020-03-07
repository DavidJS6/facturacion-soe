package bo.edu.uagrm.soe.facturacionsoe.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "products", schema = "public", catalog = "facturacion-soe")
public class Product {
    private Long id;
    private String code;
    private String name;
    private String description;
    @JsonIgnore
    private Collection<InvoiceItem> invoiceItemList;
    @JsonIgnore
    private Collection<ProductPrice> productPriceList;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(code, product.code) &&
                Objects.equals(name, product.name) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCode(), getName(), getDescription());
    }

    @OneToMany(mappedBy = "product")
    public Collection<InvoiceItem> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(Collection<InvoiceItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }

    @OneToMany(mappedBy = "product")
    public Collection<ProductPrice> getProductPriceList() {
        return productPriceList;
    }

    public void setProductPriceList(Collection<ProductPrice> productPriceList) {
        this.productPriceList = productPriceList;
    }
}
