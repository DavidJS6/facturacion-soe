package bo.edu.uagrm.soe.facturacionsoe.valueobjects.types;

import bo.edu.uagrm.soe.facturacionsoe.valueobjects.AbstractValueObject;

public class StringNotNull extends AbstractValueObject<String> {
    public StringNotNull(String value) {
        super(value);
    }

    @Override
    public void validateValue(String value) {
        if (value == null) {
            throw new NullPointerException("String value cannot be nulls");
        }
    }
}
