package bo.edu.uagrm.soe.facturacionsoe.valueobjects;

import bo.edu.uagrm.soe.facturacionsoe.dto.request.ProductPriceDto;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.types.BooleanNotNull;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.types.LongNotNull;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.types.TimestampValueObject;

public class ProductPriceValueObject {
    private PositiveDouble amountObject;
    private TimestampValueObject startTimestampObject;
    private TimestampValueObject endTimestampObject;
    private BooleanNotNull isActiveObject;
    private LongNotNull productIdObject;

    public ProductPriceValueObject(ProductPriceDto productPriceDto) {
        this.amountObject = new PositiveDouble(productPriceDto.getAmount());
        this.startTimestampObject = new TimestampValueObject(productPriceDto.getStartTimestamp());
        this.endTimestampObject = new TimestampValueObject(productPriceDto.getEndTimestamp());
        this.isActiveObject = new BooleanNotNull(productPriceDto.getActive());
        this.productIdObject = new LongNotNull(productPriceDto.getProductId());
    }

    public PositiveDouble getAmountObject() {
        return amountObject;
    }

    public void setAmountObject(PositiveDouble amountObject) {
        this.amountObject = amountObject;
    }

    public TimestampValueObject getStartTimestampObject() {
        return startTimestampObject;
    }

    public void setStartTimestampObject(TimestampValueObject startTimestampObject) {
        this.startTimestampObject = startTimestampObject;
    }

    public TimestampValueObject getEndTimestampObject() {
        return endTimestampObject;
    }

    public void setEndTimestampObject(TimestampValueObject endTimestampObject) {
        this.endTimestampObject = endTimestampObject;
    }

    public BooleanNotNull getIsActiveObject() {
        return isActiveObject;
    }

    public void setIsActiveObject(BooleanNotNull isActiveObject) {
        this.isActiveObject = isActiveObject;
    }

    public LongNotNull getProductIdObject() {
        return productIdObject;
    }

    public void setProductIdObject(LongNotNull productIdObject) {
        this.productIdObject = productIdObject;
    }
}
