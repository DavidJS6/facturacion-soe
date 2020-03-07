package bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.create;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Request;

import java.sql.Timestamp;

public class CreateProductPriceCommand implements Request<ProductPrice> {

    private Double amount;
    private Timestamp startTimestamp;
    private Timestamp endTimestamp;
    private Boolean isActive;
    private Long productId;

    public CreateProductPriceCommand(Double amount, Timestamp startTimestamp, Timestamp endTimestamp,
                                     Boolean isActive, Long productId) {
        this.amount = amount;
        this.startTimestamp = startTimestamp;
        this.endTimestamp = endTimestamp;
        this.isActive = isActive;
        this.productId = productId;
    }

    public Double getAmount() {
        return amount;
    }

    public Timestamp getStartTimestamp() {
        return startTimestamp;
    }

    public Timestamp getEndTimestamp() {
        return endTimestamp;
    }

    public Boolean getActive() {
        return isActive;
    }

    public Long getProductId() {
        return productId;
    }
}
