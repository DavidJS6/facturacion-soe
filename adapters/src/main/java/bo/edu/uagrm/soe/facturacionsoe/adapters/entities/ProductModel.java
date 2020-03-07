package bo.edu.uagrm.soe.facturacionsoe.adapters.entities;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

public class ProductModel extends Product {
    /*private Collection<InvoiceItemModel> invoiceItemList;
    private Collection<ProductPriceModel> productPriceList;*/

    public ProductModel() {
        super();
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public String getCode() {
        return super.getCode();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
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

    /*

    @Override
    public Collection<InvoiceItemModel> getInvoiceItemList() {
        return super.getInvoiceItemList();
    }

    @Override
    public void setInvoiceItemList(Collection<InvoiceItemModel> invoiceItemList) {
        super.setInvoiceItemList(invoiceItemList);
    }

    @Override
    public Collection<ProductPriceModel> getProductPriceList() {
        return super.getProductPriceList();
    }

    @Override
    public void setProductPriceList(Collection<ProductPriceModel> productPriceList) {
        super.setProductPriceList(productPriceList);
    }
    */

}
