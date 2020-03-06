package bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects;

public abstract class AbstractValueObject<TObject> {
    protected TObject value;

    public AbstractValueObject(TObject value) {
        validateValue(value);
        this.value = value;
    }

    public TObject getValue() {
        return value;
    }

    protected abstract void validateValue(TObject value) throws RuntimeException;
}
