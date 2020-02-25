package bo.edu.uagrm.soe.facturacionsoe.dto.validated.types;

public class DoubleObject extends AbstractDataTypeValueObject<Double> {
    public DoubleObject(Double value) {
        super(value);
    }

    @Override
    public void validateValue(Double value) {
        if (value == null) {
            throw new NullPointerException("The Double value cannot be null");
        }
        if (value <= 0) {
            throw new IllegalArgumentException("The Double value must be more than 0");
        }
    }
}
