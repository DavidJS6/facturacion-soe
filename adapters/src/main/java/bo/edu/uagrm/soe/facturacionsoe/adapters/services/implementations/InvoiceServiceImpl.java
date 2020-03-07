package bo.edu.uagrm.soe.facturacionsoe.adapters.services.implementations;

import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.parsing.EntityToResponseDtoParser;
import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.parsing.RequestDtoToEntityParser;
import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.request.InvoiceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.response.InvoiceResponseDto;
import bo.edu.uagrm.soe.facturacionsoe.adapters.services.InvoiceService;
import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.InvoiceMediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.cancel.CancelInvoiceByIdCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create.CreateInvoiceCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.delete.DeleteInvoiceByIdCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getall.GetAllInvoicesQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getbyid.GetInvoiceByIdQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.NotSupportedException;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private InvoiceMediator mediator;
    private RequestDtoToEntityParser<InvoiceRequestDto, CreateInvoiceCommand> requestsParser;
    private EntityToResponseDtoParser<Invoice, InvoiceResponseDto> responseParser;

    @Autowired
    public InvoiceServiceImpl(@Qualifier("InvoiceMediator") InvoiceMediator mediator,
                              RequestDtoToEntityParser<InvoiceRequestDto, CreateInvoiceCommand> requestsParser,
                              EntityToResponseDtoParser<Invoice, InvoiceResponseDto> responseParser
    ) {
        this.mediator = mediator;
        this.requestsParser = requestsParser;
        this.responseParser = responseParser;
    }

    @Override
    public InvoiceResponseDto cancel(Long id) throws Exception {
        Invoice invoice = mediator.send(new CancelInvoiceByIdCommand(id));
        return responseParser.parseEntityToResponseDto(invoice);
    }

    @Override
    public List<InvoiceResponseDto> findAll() {
        List<Invoice> invoices = mediator.send(new GetAllInvoicesQuery());
        return responseParser.parseEntitiesToResponseDtos(invoices);
    }

    @Override
    public InvoiceResponseDto findById(Long id) throws Exception {
        Invoice invoice = mediator.send(new GetInvoiceByIdQuery(id));
        return responseParser.parseEntityToResponseDto(invoice);
    }

    @Override
    public InvoiceResponseDto update(Long id, InvoiceRequestDto invoiceRequestDto) throws Exception {
        throw new NotSupportedException();
    }

    @Override
    public InvoiceResponseDto store(InvoiceRequestDto invoiceRequestDto) throws Exception {
        CreateInvoiceCommand createInvoiceCommand = requestsParser.parseRequestDtoToCommand(invoiceRequestDto);
        Invoice createdInvoice = mediator.send(createInvoiceCommand);
        return responseParser.parseEntityToResponseDto(createdInvoice);
    }

    @Override
    public void delete(Long id) throws Exception {
        mediator.send(new DeleteInvoiceByIdCommand(id));
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
