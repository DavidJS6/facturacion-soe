package bo.edu.uagrm.soe.facturacionsoe.database.services;

import bo.edu.uagrm.soe.facturacionsoe.database.models.Payment;
import bo.edu.uagrm.soe.facturacionsoe.dto.PaymentDto;

import java.util.Collection;

public interface PaymentService {

    void save(PaymentDto paymentDto);

    void update(Long paymentId, PaymentDto paymentDto);

    void delete(Long paymentId);

    Collection<Payment> getAllPayments();

}
