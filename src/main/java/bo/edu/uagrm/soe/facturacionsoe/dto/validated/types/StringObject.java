package bo.edu.uagrm.soe.facturacionsoe.dto.validated.types;

import bo.edu.uagrm.soe.facturacionsoe.exceptions.customs.InvalidStringException;

public class StringObject {

    private String value;

    public StringObject(String value) {
        validateValue(value);
        this.value = value;
    }

    private void validateValue(String value) {
        if (value == null) {
            throw new NullPointerException("String value cannot be nulls");
        }
        if (value.length() > 50) {
            throw new IllegalArgumentException("Value cannot be longer than 50 characters");
        }
    }

    public String getValue() {
        return value;
    }

}
