package bo.edu.uagrm.soe.facturacionsoe.valueobjects;

import bo.edu.uagrm.soe.facturacionsoe.valueobjects.types.LongNotNull;

public class IdValueObject extends LongNotNull {
    public IdValueObject(Long value) {
        super(value);
    }

    @Override
    public void validateValue(Long value) {
        super.validateValue(value);
        if (value < 1) {
            throw new RuntimeException("An id can not be less than 1");
        }
    }
}
