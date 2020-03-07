package bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.usecase;

import bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring.InvoiceItemSpringRepository;
import bo.edu.uagrm.soe.facturacionsoe.entities.InvoiceItem;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.InvoiceItemRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InvoiceItemRepositoryImpl implements InvoiceItemRepository<InvoiceItem> {

    private final InvoiceItemSpringRepository repository;

    public InvoiceItemRepositoryImpl(InvoiceItemSpringRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<InvoiceItem> findAll() {
        return repository.findAll();
    }

    @Override
    public InvoiceItem findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public InvoiceItem save(InvoiceItem invoiceItem) {
        return repository.save(invoiceItem);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
