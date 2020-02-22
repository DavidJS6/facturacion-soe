package bo.edu.uagrm.soe.facturacionsoe.dto.validated.types;

public class LongObject {

    private Long value;

    public LongObject(Long value) {
        validateValue(value);
        this.value = value;
    }

    private void validateValue(Long value) {
        if (value == null) {
            throw new NullPointerException("Long value cannot be null");
        }
    }

    public Long getValue() {
        return value;
    }

}
