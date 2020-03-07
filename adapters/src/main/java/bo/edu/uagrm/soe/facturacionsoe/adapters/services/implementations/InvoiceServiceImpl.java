package bo.edu.uagrm.soe.facturacionsoe.adapters.services.implementations;

import bo.edu.uagrm.soe.facturacionsoe.adapters.services.InvoiceService;
import bo.edu.uagrm.soe.facturacionsoe.adapters.services.implementations.parsers.InvoiceParser;
import bo.edu.uagrm.soe.facturacionsoe.adapters.services.implementations.parsers.ProductParser;
import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.InvoiceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.response.InvoiceResponseDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.InvoiceMediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getall.GetAllInvoicesHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getall.GetAllInvoicesQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.ProductMediator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private InvoiceMediator mediator;
    private InvoiceParser parser;

    public InvoiceServiceImpl(@Qualifier("InvoiceMediator") InvoiceMediator mediator, InvoiceParser parser) {
        this.mediator = mediator;
        this.parser = parser;
    }

    @Override
    public InvoiceResponseDto cancel(Long id) throws Exception {
        return null;
    }

    @Override
    public List<InvoiceResponseDto> findAll() {
        List<Invoice> invoices = mediator.send(new GetAllInvoicesQuery());
        return parser.parseEntitiesToResponseDtos(invoices);
    }

    @Override
    public InvoiceResponseDto findById(Long id) throws Exception {
        return null;
    }

    @Override
    public InvoiceResponseDto update(Long id, InvoiceRequestDto invoiceRequestDto) throws Exception {
        return null;
    }

    @Override
    public InvoiceResponseDto store(InvoiceRequestDto invoiceRequestDto) throws Exception {
        return null;
    }

    @Override
    public void delete(Long id) throws Exception {

    }

    /*private static final String CANCELLED_STATUS = "CANCELLED";
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
*/
}
