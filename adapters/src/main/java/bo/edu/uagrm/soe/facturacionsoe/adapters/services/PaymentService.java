package bo.edu.uagrm.soe.facturacionsoe.adapters.services;

import bo.edu.uagrm.soe.facturacionsoe.entities.Payment;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.PaymentRequestDto;

public interface PaymentService extends CrudService<PaymentRequestDto, Payment, Exception> {
}
