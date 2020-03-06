package bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects;

import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.PaymentRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.types.StringNotNull;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.types.TimestampValueObject;

public class PaymentValueObject extends AbstractValueObject<PaymentRequestDto> {
    public PaymentValueObject(PaymentRequestDto value) {
        super(value);
    }

    @Override
    protected void validateValue(PaymentRequestDto paymentRequestDto) throws RuntimeException {
        new PositiveDouble(paymentRequestDto.getPaymentAmount());
        new TimestampValueObject(paymentRequestDto.getTimestamp());
        new StringNotNull(paymentRequestDto.getPaymentMode());
    }
}
