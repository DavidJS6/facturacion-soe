package bo.edu.uagrm.soe.facturacionsoe.adapters.entities;

import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "invoices", schema = "public", catalog = "facturacion-soe")
public class InvoiceModel extends Invoice<PaymentModel, InvoiceItemModel> {

    public InvoiceModel() {
        super();
    }

    @Override
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return super.getId();
    }

    @Override
    @Basic
    @Column(name = "invoice_number")
    public Long getInvoiceNumber() {
        return super.getInvoiceNumber();
    }

    @Override
    @Basic
    @Column(name = "client_name")
    public String getClientName() {
        return super.getClientName();
    }

    @Override
    @Basic
    @Column(name = "nit")
    public Long getNit() {
        return super.getNit();
    }

    @Override
    @Basic
    @Column(name = "total_amount")
    public Double getTotalAmount() {
        return super.getTotalAmount();
    }

    @Override
    @Basic
    @Column(name = "timestamp")
    public Timestamp getTimestamp() {
        return super.getTimestamp();
    }

    @Override
    @Basic
    @Column(name = "status")
    public String getStatus() {
        return super.getStatus();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceModel invoiceModel = (InvoiceModel) o;
        return Objects.equals(getId(), invoiceModel.getId()) &&
                Objects.equals(getInvoiceNumber(), invoiceModel.getInvoiceNumber()) &&
                Objects.equals(getClientName(), invoiceModel.getClientName()) &&
                Objects.equals(getNit(), invoiceModel.getNit()) &&
                Objects.equals(getTotalAmount(), invoiceModel.getTotalAmount()) &&
                Objects.equals(getTimestamp(), invoiceModel.getTimestamp()) &&
                Objects.equals(getStatus(), invoiceModel.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getInvoiceNumber(), getTotalAmount(), getTimestamp(), getStatus());
    }

    @Override
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.PERSIST)
    public Collection<InvoiceItemModel> getInvoiceItems() {
        return super.getInvoiceItems();
    }

    @Override
    public void setInvoiceItems(Collection<InvoiceItemModel> invoiceItemModels) {
        super.setInvoiceItems(invoiceItemModels);
    }

    @Override
    @OneToOne(mappedBy = "invoice", cascade = CascadeType.PERSIST)
    public PaymentModel getPayment() {
        return super.getPayment();
    }

    @Override
    public void setPayment(PaymentModel payment) {
        super.setPayment(payment);
    }
}
