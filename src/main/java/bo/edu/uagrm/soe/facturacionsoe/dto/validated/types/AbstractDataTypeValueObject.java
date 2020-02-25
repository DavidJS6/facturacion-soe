package bo.edu.uagrm.soe.facturacionsoe.dto.validated.types;

public abstract class AbstractDataTypeValueObject<TObject> {
    protected TObject value;

    public AbstractDataTypeValueObject(TObject value) {
        validateValue(value);
        this.value = value;
    }

    public TObject getValue() {
        return value;
    }

    protected abstract void validateValue(TObject value) throws RuntimeException;
}
