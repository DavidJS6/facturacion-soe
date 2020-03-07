package bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects;

import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.ProductPriceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.create.CreateProductPriceCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.types.BooleanNotNull;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.types.LongNotNull;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.types.TimestampValueObject;

public class ProductPriceValueObject extends AbstractValueObject<CreateProductPriceCommand> {
    /*
    private PositiveDouble amountObject;
    private TimestampValueObject startTimestampObject;
    private TimestampValueObject endTimestampObject;
    private BooleanNotNull isActiveObject;
    private LongNotNull productIdObject;

    public ProductPriceValueObject(ProductPriceRequestDto productPriceRequestDto) {
        this.amountObject = new PositiveDouble(productPriceRequestDto.getAmount());
        this.startTimestampObject = new TimestampValueObject(productPriceRequestDto.getStartTimestamp());
        this.endTimestampObject = new TimestampValueObject(productPriceRequestDto.getEndTimestamp());
        this.isActiveObject = new BooleanNotNull(productPriceRequestDto.getActive());
        this.productIdObject = new LongNotNull(productPriceRequestDto.getProductId());
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
    */

    public ProductPriceValueObject(CreateProductPriceCommand value) {
        super(value);
    }

    @Override
    protected void validateValue(CreateProductPriceCommand value) throws RuntimeException {
        new PositiveDouble(value.getAmount());
        new TimestampValueObject(value.getStartTimestamp());
        new TimestampValueObject(value.getEndTimestamp());
        new BooleanNotNull(value.getActive());
        new LongNotNull(value.getProductId());
    }

}
