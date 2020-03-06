package bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects;

import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.types.DoubleNotNull;

public class PositiveDouble extends DoubleNotNull {
    public PositiveDouble(Double value) {
        super(value);
    }

    @Override
    public void validateValue(Double value) {
        super.validateValue(value);
        if (value <= 0) {
            throw new IllegalArgumentException("The Double value must be more than 0");
        }
    }
}
