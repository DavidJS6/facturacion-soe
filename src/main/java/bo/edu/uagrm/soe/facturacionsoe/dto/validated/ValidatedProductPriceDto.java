package bo.edu.uagrm.soe.facturacionsoe.dto.validated;

import bo.edu.uagrm.soe.facturacionsoe.dto.raw.ProductPriceDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.BooleanObject;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.DoubleObject;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.LongObject;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.TimestampObject;

public class ValidatedProductPriceDto {

    private DoubleObject amountObject;
    private TimestampObject startTimestampObject;
    private TimestampObject endTimestampObject;
    private BooleanObject isActiveObject;
    private LongObject productIdObject;

    public ValidatedProductPriceDto(ProductPriceDto productPriceDto) {
        this.amountObject = new DoubleObject(productPriceDto.getAmount());
        this.startTimestampObject = new TimestampObject(productPriceDto.getStartTimestamp());
        this.endTimestampObject = new TimestampObject(productPriceDto.getEndTimestamp());
        this.isActiveObject = new BooleanObject(productPriceDto.getActive());
        this.productIdObject = new LongObject(productPriceDto.getProductId());
    }

    public DoubleObject getAmountObject() {
        return amountObject;
    }

    public void setAmountObject(DoubleObject amountObject) {
        this.amountObject = amountObject;
    }

    public TimestampObject getStartTimestampObject() {
        return startTimestampObject;
    }

    public void setStartTimestampObject(TimestampObject startTimestampObject) {
        this.startTimestampObject = startTimestampObject;
    }

    public TimestampObject getEndTimestampObject() {
        return endTimestampObject;
    }

    public void setEndTimestampObject(TimestampObject endTimestampObject) {
        this.endTimestampObject = endTimestampObject;
    }

    public BooleanObject getIsActiveObject() {
        return isActiveObject;
    }

    public void setIsActiveObject(BooleanObject isActiveObject) {
        this.isActiveObject = isActiveObject;
    }

    public LongObject getProductIdObject() {
        return productIdObject;
    }

    public void setProductIdObject(LongObject productIdObject) {
        this.productIdObject = productIdObject;
    }

}
