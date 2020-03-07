package bo.edu.uagrm.soe.facturacionsoe.usecases.products.create;

public class CreateInvoiceItemCommand {

    private Double unitPrice;
    private Double quantity;
    private Double itemAmount;
    private Long productId;

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

}
