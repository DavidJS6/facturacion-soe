package bo.edu.uagrm.soe.facturacionsoe.adapters.entities;

import bo.edu.uagrm.soe.facturacionsoe.entities.Payment;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

public class PaymentModel extends Payment {
    public PaymentModel() {
        super();
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public Double getPaymentAmount() {
        return super.getPaymentAmount();
    }

    @Override
    public String getPaymentCode() {
        return super.getPaymentCode();
    }

    @Override
    public Timestamp getTimestamp() {
        return super.getTimestamp();
    }

    @Override
    public String getPaymentMode() {
        return super.getPaymentMode();
    }

    /*
    @Override
    public InvoiceModel getInvoice() {
        return super.getInvoice();
    }

    @Override
    public void setInvoice(InvoiceModel invoice) {
        super.setInvoice(invoice);
    }
    */

}
