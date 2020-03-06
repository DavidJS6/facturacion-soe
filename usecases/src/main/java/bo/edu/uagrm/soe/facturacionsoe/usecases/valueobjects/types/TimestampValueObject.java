package bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.types;

import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.AbstractValueObject;

import java.sql.Timestamp;

public class TimestampValueObject extends AbstractValueObject<Timestamp> {
    public TimestampValueObject(Timestamp value) {
        super(value);
    }

    @Override
    public void validateValue(Timestamp value) {
        if (value == null) {
            throw new NullPointerException("The timestamp value cannot be null");
        }
    }
}
