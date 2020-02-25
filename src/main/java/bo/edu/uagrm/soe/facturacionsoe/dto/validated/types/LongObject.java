package bo.edu.uagrm.soe.facturacionsoe.dto.validated.types;

public class LongObject extends AbstractDataTypeValueObject<Long> {
    public LongObject(Long value) {
        super(value);
    }

    @Override
    public void validateValue(Long value) {
        if (value == null) {
            throw new NullPointerException("Long value cannot be null");
        }
    }
}
