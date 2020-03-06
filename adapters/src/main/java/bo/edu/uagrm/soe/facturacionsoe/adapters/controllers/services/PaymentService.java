package bo.edu.uagrm.soe.facturacionsoe.adapters.controllers.services;

import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.PaymentRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.entities.Payment;

public interface PaymentService extends CrudService<PaymentRequestDto, Payment, Exception> {
}
