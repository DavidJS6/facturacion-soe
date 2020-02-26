package bo.edu.uagrm.soe.facturacionsoe.valueobjects;

import bo.edu.uagrm.soe.facturacionsoe.dto.request.PaymentRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.types.StringNotNull;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.types.TimestampValueObject;

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
