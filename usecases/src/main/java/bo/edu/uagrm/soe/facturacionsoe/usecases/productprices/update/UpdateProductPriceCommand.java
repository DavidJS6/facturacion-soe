package bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.update;

import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Request;

import java.sql.Timestamp;

public class UpdateProductPriceCommand implements Request<ProductPrice> {

    private Long id;
    private Double amount;
    private Timestamp startTimestamp;
    private Timestamp endTimestamp;
    private Boolean isActive;
    private Long productId;

    public UpdateProductPriceCommand(Long id, Double amount, Timestamp startTimestamp, Timestamp endTimestamp,
                                     Boolean isActive, Long productId) {
        this.id = id;
        this.amount = amount;
        this.startTimestamp = startTimestamp;
        this.endTimestamp = endTimestamp;
        this.isActive = isActive;
        this.productId = productId;
    }

    public Long getId() {
        return id;
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
