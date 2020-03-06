package bo.edu.uagrm.soe.facturacionsoe.entities;

import java.sql.Timestamp;

public class Payment<TInvoice extends Invoice> {
    private Long id;
    private Double paymentAmount;
    private String paymentCode;
    private Timestamp timestamp;
    private String paymentMode;
    private TInvoice invoice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public TInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(TInvoice invoice) {
        this.invoice = invoice;
    }
}
