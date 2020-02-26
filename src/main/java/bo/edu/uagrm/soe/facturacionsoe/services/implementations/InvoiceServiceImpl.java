package bo.edu.uagrm.soe.facturacionsoe.services.implementations;

import bo.edu.uagrm.soe.facturacionsoe.database.models.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.database.repositories.InvoiceRepository;
import bo.edu.uagrm.soe.facturacionsoe.dto.request.InvoiceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.response.InvoiceResponseDto;
import bo.edu.uagrm.soe.facturacionsoe.services.InvoiceService;
import bo.edu.uagrm.soe.facturacionsoe.services.implementations.parsers.InvoiceParser;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.InvoiceValueObject;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    private static final String CANCELLED_STATUS = "CANCELLED";
    private InvoiceRepository repository;
    private InvoiceParser parser;

    public InvoiceServiceImpl(InvoiceRepository repository, InvoiceParser parser) {
        this.repository = repository;
        this.parser = parser;
    }

    @Override
    public List<InvoiceResponseDto> findAll() {
        List<Invoice> invoices = repository.findAll();
        return parser.parseEntitiesToResponseDtos(invoices);
    }

    @Override
    public InvoiceResponseDto findById(Long id) throws Exception {
        Invoice invoice = repository.findById(id)
                .orElseThrow(() -> new Exception("The invoice with the specified id was not found"));
        return parser.parseEntityToResponseDto(invoice);
    }

    @Override
    public InvoiceResponseDto update(Long id, InvoiceRequestDto invoiceValueObject) throws Exception {
        throw new UnsupportedOperationException("An invoice can not be generically updated");
    }

    @Transactional
    @Override
    public InvoiceResponseDto store(InvoiceRequestDto invoiceRequestDto) throws Exception {
        InvoiceValueObject validatedInvoice = new InvoiceValueObject(invoiceRequestDto);
        Invoice invoiceToSave = parser.parseRequestDtoToEntity(validatedInvoice.getValue());
        Invoice savedInvoice = repository.save(invoiceToSave);
        return parser.parseEntityToResponseDto(savedInvoice);
    }

    @Override
    public void delete(Long id) throws Exception {
        repository.deleteById(id);
    }

    @Override
    public InvoiceResponseDto cancel(Long id) throws Exception {
        Invoice invoice = repository.findById(id)
                .orElseThrow(() -> new Exception("The invoice with the specified id was not found"));
        invoice.setStatus(CANCELLED_STATUS);
        repository.save(invoice);
        return parser.parseEntityToResponseDto(invoice);
    }
}