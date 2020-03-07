package bo.edu.uagrm.soe.facturacionsoe.adapters.services.implementations.parsers;

import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.parsing.RequestDtoToEntityParserImpl;
import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.request.InvoiceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create.CreateInvoiceCommand;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class InvoiceRequestParser extends RequestDtoToEntityParserImpl<InvoiceRequestDto, CreateInvoiceCommand> {
    @Override
    public CreateInvoiceCommand parseRequestDtoToCommand(InvoiceRequestDto invoiceRequestDto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(invoiceRequestDto, CreateInvoiceCommand.class);
    }
}
