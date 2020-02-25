package bo.edu.uagrm.soe.facturacionsoe.dto.validated.types;

import java.sql.Timestamp;

public class TimestampObject extends AbstractDataTypeValueObject<Timestamp> {
    public TimestampObject(Timestamp value) {
        super(value);
    }

    @Override
    public void validateValue(Timestamp value) {
        if (value == null) {
            throw new NullPointerException("The timestamp value cannot be null");
        }
    }
}
