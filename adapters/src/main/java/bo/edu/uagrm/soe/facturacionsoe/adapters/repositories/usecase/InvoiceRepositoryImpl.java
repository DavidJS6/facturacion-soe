package bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.usecase;

import bo.edu.uagrm.soe.facturacionsoe.adapters.entities.InvoiceModel;
import bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring.InvoiceSpringRepository;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.InvoiceRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InvoiceRepositoryImpl implements InvoiceRepository<InvoiceModel> {

    private final InvoiceSpringRepository repository;

    public InvoiceRepositoryImpl(InvoiceSpringRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<InvoiceModel> findAll() {
        return repository.findAll();
    }

    @Override
    public InvoiceModel findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public InvoiceModel save(InvoiceModel invoice) {
        return repository.save(invoice);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
