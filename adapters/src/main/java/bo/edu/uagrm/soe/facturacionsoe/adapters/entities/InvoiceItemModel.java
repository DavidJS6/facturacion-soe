package bo.edu.uagrm.soe.facturacionsoe.adapters.entities;

import bo.edu.uagrm.soe.facturacionsoe.entities.InvoiceItem;

import javax.persistence.*;
import java.util.Objects;

public class InvoiceItemModel extends InvoiceItem {
    /*private InvoiceModel invoice;
    private ProductModel product;*/

    public InvoiceItemModel() {
        super();
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public Double getUnitPrice() {
        return super.getUnitPrice();
    }

    @Override
    public Double getQuantity() {
        return super.getQuantity();
    }

    @Override
    public Double getItemAmount() {
        return super.getItemAmount();
    }

    /*
    public InvoiceModel getInvoice() {
        return super.getInvoice();
    }

    @Override
    public void setInvoice(InvoiceModel invoice) {
        super.setInvoice(invoice);
    }

    public ProductModel getProduct() {
        return super.getProduct();
    }

    @Override
    public void setProduct(ProductModel product) {
        super.setProduct(product);
    }
    */

}
