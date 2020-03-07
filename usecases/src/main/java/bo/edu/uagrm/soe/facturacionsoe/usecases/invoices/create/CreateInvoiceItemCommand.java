package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create;

public class CreateInvoiceItemCommand {
    private Double unitPrice;
    private Double quantity;
    private Double itemAmount;
    private Long productId;

    public CreateInvoiceItemCommand() {
    }

    public CreateInvoiceItemCommand(Double unitPrice, Double quantity, Double itemAmount, Long productId) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.itemAmount = itemAmount;
        this.productId = productId;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getItemAmount() {
        return itemAmount;
    }

    public Long getProductId() {
        return productId;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void setItemAmount(Double itemAmount) {
        this.itemAmount = itemAmount;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
