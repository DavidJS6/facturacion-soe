package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create;

import bo.edu.uagrm.soe.facturacionsoe.entities.Payment;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Request;

import java.sql.Timestamp;

public class CreatePaymentCommand implements Request<Payment> {
    private Double paymentAmount;
    private String paymentCode;
    private Timestamp timestamp;
    private String paymentMode;

    public CreatePaymentCommand() {
    }

    public CreatePaymentCommand(Double paymentAmount, String paymentCode, Timestamp timestamp, String paymentMode) {
        this.paymentAmount = paymentAmount;
        this.paymentCode = paymentCode;
        this.timestamp = timestamp;
        this.paymentMode = paymentMode;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}
