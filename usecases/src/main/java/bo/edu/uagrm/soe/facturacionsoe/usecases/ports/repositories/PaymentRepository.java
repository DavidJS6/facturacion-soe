package bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories;

import bo.edu.uagrm.soe.facturacionsoe.entities.Payment;

public interface PaymentRepository<TPayment extends Payment> extends CrudRepository<TPayment> {
}
