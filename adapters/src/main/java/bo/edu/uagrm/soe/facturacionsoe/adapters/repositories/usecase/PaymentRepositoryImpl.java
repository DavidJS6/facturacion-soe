package bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.usecase;

import bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring.PaymentSpringRepository;
import bo.edu.uagrm.soe.facturacionsoe.entities.Payment;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.PaymentRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentRepositoryImpl implements PaymentRepository<Payment> {

    private final PaymentSpringRepository repository;

    public PaymentRepositoryImpl(PaymentSpringRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Payment> findAll() {
        return repository.findAll();
    }

    @Override
    public Payment findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Payment save(Payment payment) {
        return repository.save(payment);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
