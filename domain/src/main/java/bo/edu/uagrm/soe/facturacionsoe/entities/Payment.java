package bo.edu.uagrm.soe.facturacionsoe.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "payments", schema = "public", catalog = "facturacion-soe")
public class Payment {
    private Long id;
    private Double paymentAmount;
    private String paymentCode;
    private Timestamp timestamp;
    private String paymentMode;
    private Invoice invoice;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "payment_amount")
    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Basic
    @Column(name = "payment_code")
    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    @Basic
    @Column(name = "timestamp")
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "payment_mode")
    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.getId()) &&
                Objects.equals(paymentAmount, payment.paymentAmount) &&
                Objects.equals(paymentCode, payment.paymentCode) &&
                Objects.equals(timestamp, payment.timestamp) &&
                Objects.equals(paymentMode, payment.paymentMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPaymentAmount(), getPaymentCode(), getTimestamp(), getPaymentMode());
    }

    @OneToOne
    @JoinColumn(name = "invoice_id", referencedColumnName = "id", nullable = false)
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
