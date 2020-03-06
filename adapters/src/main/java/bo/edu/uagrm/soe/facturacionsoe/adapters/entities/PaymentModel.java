package bo.edu.uagrm.soe.facturacionsoe.adapters.entities;

import bo.edu.uagrm.soe.facturacionsoe.entities.Payment;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "payments", schema = "public", catalog = "facturacion-soe")
public class PaymentModel extends Payment<InvoiceModel> {
    public PaymentModel() {
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
    @Column(name = "payment_amount")
    public Double getPaymentAmount() {
        return super.getPaymentAmount();
    }

    @Override
    @Basic
    @Column(name = "payment_code")
    public String getPaymentCode() {
        return super.getPaymentCode();
    }

    @Override
    @Basic
    @Column(name = "timestamp")
    public Timestamp getTimestamp() {
        return super.getTimestamp();
    }

    @Override
    @Basic
    @Column(name = "payment_mode")
    public String getPaymentMode() {
        return super.getPaymentMode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentModel paymentModel = (PaymentModel) o;
        return Objects.equals(getId(), paymentModel.getId()) &&
                Objects.equals(getPaymentAmount(), paymentModel.getPaymentAmount()) &&
                Objects.equals(getPaymentCode(), paymentModel.getPaymentCode()) &&
                Objects.equals(getTimestamp(), paymentModel.getTimestamp()) &&
                Objects.equals(getPaymentMode(), paymentModel.getPaymentMode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPaymentAmount(), getPaymentCode(), getTimestamp(), getPaymentMode());
    }

    @Override
    @OneToOne
    @JoinColumn(name = "invoice_id", referencedColumnName = "id", nullable = false)
    public InvoiceModel getInvoice() {
        return super.getInvoice();
    }

    @Override
    public void setInvoice(InvoiceModel invoice) {
        super.setInvoice(invoice);
    }
}
