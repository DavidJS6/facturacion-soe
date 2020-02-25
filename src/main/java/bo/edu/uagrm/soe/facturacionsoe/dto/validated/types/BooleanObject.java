package bo.edu.uagrm.soe.facturacionsoe.dto.validated.types;

public class BooleanObject extends AbstractDataTypeValueObject<Boolean> {
    public BooleanObject(Boolean value) {
        super(value);
    }

    @Override
    public void validateValue(Boolean value) {
        if (value == null) {
            throw new NullPointerException("The Boolean value cannot be null");
        }
    }
}
