package bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.types;

import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.AbstractValueObject;

public class DoubleNotNull extends AbstractValueObject<Double> {
    public DoubleNotNull(Double value) {
        super(value);
    }

    @Override
    public void validateValue(Double value) {
        if (value == null) {
            throw new NullPointerException("The Double value cannot be null");
        }
    }
}
