package bo.edu.uagrm.soe.facturacionsoe.adapters.services.implementations.parsers;

import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.parsing.EntityToResponseDtoParserImpl;
import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.response.InvoiceResponseDto;
import bo.edu.uagrm.soe.facturacionsoe.entities.Invoice;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class InvoiceResponseParser extends EntityToResponseDtoParserImpl<Invoice, InvoiceResponseDto> {
    @Override
    public InvoiceResponseDto parseEntityToResponseDto(Invoice invoice) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(invoice, InvoiceResponseDto.class);
    }
}
