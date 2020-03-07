package bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects;

import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create.CreatePaymentCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.types.StringNotNull;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.types.TimestampValueObject;

public class PaymentValueObject extends AbstractValueObject<CreatePaymentCommand> {
    public PaymentValueObject(CreatePaymentCommand value) {
        super(value);
    }

    @Override
    protected void validateValue(CreatePaymentCommand paymentRequestDto) throws RuntimeException {
        new PositiveDouble(paymentRequestDto.getPaymentAmount());
        new TimestampValueObject(paymentRequestDto.getTimestamp());
        new StringNotNull(paymentRequestDto.getPaymentMode());
    }
}
