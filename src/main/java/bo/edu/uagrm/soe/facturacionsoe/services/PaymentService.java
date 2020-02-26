package bo.edu.uagrm.soe.facturacionsoe.services;

import bo.edu.uagrm.soe.facturacionsoe.database.models.Payment;
import bo.edu.uagrm.soe.facturacionsoe.dto.request.PaymentRequestDto;

public interface PaymentService extends CrudService<PaymentRequestDto, Payment, Exception> {
}
