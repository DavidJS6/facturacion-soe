package bo.edu.uagrm.soe.facturacionsoe.adapters.entities;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

public class InvoiceModel extends Invoice {

    public InvoiceModel() {
        super();
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public Long getInvoiceNumber() {
        return super.getInvoiceNumber();
    }

    @Override
    public String getClientName() {
        return super.getClientName();
    }

    @Override
    public Long getNit() {
        return super.getNit();
    }

    @Override
    public Double getTotalAmount() {
        return super.getTotalAmount();
    }

    @Override
    public Timestamp getTimestamp() {
        return super.getTimestamp();
    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }

    /*
    @Override
    public Collection<InvoiceItemModel> getInvoiceItems() {
        return super.getInvoiceItems();
    }

    @Override
    public void setInvoiceItems(Collection<InvoiceItemModel> invoiceItemModels) {
        super.setInvoiceItems(invoiceItemModels);
    }

    @Override
    public PaymentModel getPayment() {
        return super.getPayment();
    }

    @Override
    public void setPayment(PaymentModel payment) {
        super.setPayment(payment);
    }
    */

}
