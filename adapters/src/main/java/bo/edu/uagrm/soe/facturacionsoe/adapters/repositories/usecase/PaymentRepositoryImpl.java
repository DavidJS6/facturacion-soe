package bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.usecase;

import bo.edu.uagrm.soe.facturacionsoe.adapters.entities.PaymentModel;
import bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring.PaymentSpringRepository;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.PaymentRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentRepositoryImpl implements PaymentRepository<PaymentModel> {

    private final PaymentSpringRepository repository;

    public PaymentRepositoryImpl(PaymentSpringRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PaymentModel> findAll() {
        return repository.findAll();
    }

    @Override
    public PaymentModel findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public PaymentModel save(PaymentModel payment) {
        return repository.save(payment);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
