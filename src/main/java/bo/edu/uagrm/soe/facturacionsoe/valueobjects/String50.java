package bo.edu.uagrm.soe.facturacionsoe.valueobjects;

import bo.edu.uagrm.soe.facturacionsoe.valueobjects.types.StringNotNull;

public class String50 extends StringNotNull {
    public String50(String value) {
        super(value);
    }

    @Override
    public void validateValue(String value) {
        super.validateValue(value);
        if (value.length() > 50) {
            throw new IllegalArgumentException("Value cannot be longer than 50 characters");
        }
    }
}
