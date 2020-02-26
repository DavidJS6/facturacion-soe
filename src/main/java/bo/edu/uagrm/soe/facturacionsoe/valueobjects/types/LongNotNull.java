package bo.edu.uagrm.soe.facturacionsoe.valueobjects.types;

import bo.edu.uagrm.soe.facturacionsoe.valueobjects.AbstractValueObject;

public class LongNotNull extends AbstractValueObject<Long> {
    public LongNotNull(Long value) {
        super(value);
    }

    @Override
    public void validateValue(Long value) {
        if (value == null) {
            throw new NullPointerException("Long value cannot be null");
        }
    }
}
