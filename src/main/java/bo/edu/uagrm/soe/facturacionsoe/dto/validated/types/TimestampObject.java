package bo.edu.uagrm.soe.facturacionsoe.dto.validated.types;

import java.sql.Timestamp;

public class TimestampObject {

    private Timestamp value;

    public TimestampObject(Timestamp value) {
        validateValue(value);
        this.value = value;
    }

    private void validateValue(Timestamp value) {
        if (value == null) {
            throw new NullPointerException("The timestamp value cannot be null");
        }
    }

    public Timestamp getValue() {
        return value;
    }
}
