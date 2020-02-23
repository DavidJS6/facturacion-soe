package bo.edu.uagrm.soe.facturacionsoe.dto.validated.types;

public class BooleanObject {

    private Boolean value;

    public BooleanObject(Boolean value) {
        this.value = value;
    }

    private void validateValue() {
        if (value == null) {
            throw new NullPointerException("The Boolean value cannot be null");
        }
    }

    public Boolean getValue() {
        return value;
    }

}
