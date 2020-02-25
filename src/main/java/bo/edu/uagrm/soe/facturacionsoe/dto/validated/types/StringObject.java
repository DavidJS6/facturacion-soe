package bo.edu.uagrm.soe.facturacionsoe.dto.validated.types;

public class StringObject extends AbstractDataTypeValueObject<String> {
    public StringObject(String value) {
        super(value);
    }

    @Override
    public void validateValue(String value) {
        if (value == null) {
            throw new NullPointerException("String value cannot be nulls");
        }
        if (value.length() > 50) {
            throw new IllegalArgumentException("Value cannot be longer than 50 characters");
        }
    }
}
