package bo.edu.uagrm.soe.facturacionsoe.dto.validated.types;

public class DoubleObject {

    private Double value;

    public DoubleObject(Double value) {
        validateValue(value);
        this.value = value;
    }

    private void validateValue(Double value) {
        if (value == null) {
            throw new NullPointerException("The Double value cannot be null");
        }
        if (value <= 0) {
            throw new IllegalArgumentException("The Double value must be more than 0");
        }
    }

    public Double getValue() {
        return value;
    }

}
