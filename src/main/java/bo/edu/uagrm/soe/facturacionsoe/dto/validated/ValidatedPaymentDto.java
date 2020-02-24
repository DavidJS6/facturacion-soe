package bo.edu.uagrm.soe.facturacionsoe.dto.validated;

import bo.edu.uagrm.soe.facturacionsoe.dto.raw.PaymentDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.DoubleObject;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.StringObject;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.TimestampObject;

public class ValidatedPaymentDto {

    private DoubleObject paymentAmountObject;
    private StringObject paymentCodeObject;
    private TimestampObject timestampObject;
    private StringObject paymentModeObject;

    public ValidatedPaymentDto(PaymentDto paymentDto) {
        this.paymentAmountObject = new DoubleObject(paymentDto.getPaymentAmount());
        this.paymentCodeObject = new StringObject(paymentDto.getPaymentCode());
        this.timestampObject = new TimestampObject(paymentDto.getTimestamp());
        this.paymentModeObject = new StringObject(paymentDto.getPaymentMode());
    }

    public DoubleObject getPaymentAmountObject() {
        return paymentAmountObject;
    }

    public void setPaymentAmountObject(DoubleObject paymentAmountObject) {
        this.paymentAmountObject = paymentAmountObject;
    }

    public StringObject getPaymentCodeObject() {
        return paymentCodeObject;
    }

    public void setPaymentCodeObject(StringObject paymentCodeObject) {
        this.paymentCodeObject = paymentCodeObject;
    }

    public TimestampObject getTimestampObject() {
        return timestampObject;
    }

    public void setTimestampObject(TimestampObject timestampObject) {
        this.timestampObject = timestampObject;
    }

    public StringObject getPaymentModeObject() {
        return paymentModeObject;
    }

    public void setPaymentModeObject(StringObject paymentModeObject) {
        this.paymentModeObject = paymentModeObject;
    }
}
