package bo.edu.uagrm.soe.facturacionsoe.entities;

import java.util.Collection;

public class Product<TInvoiceItem extends InvoiceItem, TProductPrice extends ProductPrice> {
    private Long id;
    private String code;
    private String name;
    private String description;
    private Collection<TInvoiceItem> invoiceItemList;
    private Collection<TProductPrice> productPriceList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<TInvoiceItem> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(Collection<TInvoiceItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }

    public Collection<TProductPrice> getProductPriceList() {
        return productPriceList;
    }

    public void setProductPriceList(Collection<TProductPrice> productPriceList) {
        this.productPriceList = productPriceList;
    }
}
