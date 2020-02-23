package bo.edu.uagrm.soe.facturacionsoe.dto.validated;

import bo.edu.uagrm.soe.facturacionsoe.dto.raw.ProductPriceDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.BooleanObject;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.DoubleObject;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.TimestampObject;

public class ValidatedProductPriceDto {

    private DoubleObject amountObject;
    private TimestampObject startTimestamp;
    private TimestampObject endTimestamp;
    private BooleanObject isActive;

    public ValidatedProductPriceDto(ProductPriceDto productPriceDto) {
        this.amountObject = new DoubleObject(productPriceDto.getAmount());
        this.startTimestamp = new TimestampObject(productPriceDto.getStartTimestamp());
        this.endTimestamp = new TimestampObject(productPriceDto.getEndTimestamp());
        this.isActive = new BooleanObject(productPriceDto.getActive());
    }

    public DoubleObject getAmountObject() {
        return amountObject;
    }

    public void setAmountObject(DoubleObject amountObject) {
        this.amountObject = amountObject;
    }

    public TimestampObject getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(TimestampObject startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public TimestampObject getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(TimestampObject endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public BooleanObject getIsActive() {
        return isActive;
    }

    public void setIsActive(BooleanObject isActive) {
        this.isActive = isActive;
    }
}
