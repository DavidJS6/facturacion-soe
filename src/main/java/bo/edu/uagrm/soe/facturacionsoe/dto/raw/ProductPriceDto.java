package bo.edu.uagrm.soe.facturacionsoe.dto.raw;

import org.springframework.beans.factory.annotation.Required;

import java.sql.Timestamp;

public class ProductPriceDto {

    private Double amount;
    private Timestamp startTimestamp;
    private Timestamp endTimestamp;
    private Boolean isActive;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Timestamp getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Timestamp startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public Timestamp getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(Timestamp endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

}
