package bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.usecase;

import bo.edu.uagrm.soe.facturacionsoe.adapters.entities.InvoiceItemModel;
import bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring.InvoiceItemSpringRepository;
import bo.edu.uagrm.soe.facturacionsoe.entities.InvoiceItem;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.InvoiceItemRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InvoiceItemRepositoryImpl implements InvoiceItemRepository<InvoiceItemModel> {

    private final InvoiceItemSpringRepository repository;

    public InvoiceItemRepositoryImpl(InvoiceItemSpringRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<InvoiceItemModel> findAll() {
        return repository.findAll();
    }

    @Override
    public InvoiceItemModel findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public InvoiceItemModel save(InvoiceItemModel invoiceItem) {
        return repository.save(invoiceItem);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
