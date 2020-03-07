package bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.usecase;

import bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring.InvoiceSpringRepository;
import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.InvoiceRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InvoiceRepositoryImpl implements InvoiceRepository<Invoice> {

    private final InvoiceSpringRepository repository;

    public InvoiceRepositoryImpl(InvoiceSpringRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Invoice> findAll() {
        return repository.findAll();
    }

    @Override
    public Invoice findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Invoice save(Invoice invoice) {
        return repository.save(invoice);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
