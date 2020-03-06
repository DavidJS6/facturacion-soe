package bo.edu.uagrm.soe.facturacionsoe.entities;

public class InvoiceItem<TInvoice extends Invoice, TProduct extends Product> {
    protected Long id;
    private Double unitPrice;
    private Double quantity;
    private Double itemAmount;
    private TInvoice invoice;
    private TProduct product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(Double itemAmount) {
        this.itemAmount = itemAmount;
    }

    public TInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(TInvoice invoice) {
        this.invoice = invoice;
    }

    public TProduct getProduct() {
        return product;
    }

    public void setProduct(TProduct product) {
        this.product = product;
    }
}
