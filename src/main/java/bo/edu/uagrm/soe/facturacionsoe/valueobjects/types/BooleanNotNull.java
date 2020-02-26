package bo.edu.uagrm.soe.facturacionsoe.valueobjects.types;

import bo.edu.uagrm.soe.facturacionsoe.valueobjects.AbstractValueObject;

public class BooleanNotNull extends AbstractValueObject<Boolean> {
    public BooleanNotNull(Boolean value) {
        super(value);
    }

    @Override
    public void validateValue(Boolean value) {
        if (value == null) {
            throw new NullPointerException("The Boolean value cannot be null");
        }
    }
}
