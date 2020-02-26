package bo.edu.uagrm.soe.facturacionsoe.services.implementations.parsers;

import bo.edu.uagrm.soe.facturacionsoe.database.models.Invoice;
import bo.edu.uagrm.soe.facturacionsoe.database.models.InvoiceItem;
import bo.edu.uagrm.soe.facturacionsoe.dto.parsing.DtoEntityParserAbstractImpl;
import bo.edu.uagrm.soe.facturacionsoe.dto.request.InvoiceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.response.InvoiceResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class InvoiceParser extends DtoEntityParserAbstractImpl<InvoiceRequestDto, InvoiceResponseDto, Invoice> {
    @Override
    public InvoiceResponseDto parseEntityToResponseDto(Invoice invoice) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(invoice, InvoiceResponseDto.class);
    }

    @Override
    public Invoice parseRequestDtoToEntity(InvoiceRequestDto invoiceRequestDto) {
        ModelMapper mapper = new ModelMapper();
        mapper.addMappings(new InvoiceItemPropertyMap());
        Invoice resultInvoice = mapper.map(invoiceRequestDto, Invoice.class);
        resultInvoice.getPayment().setInvoice(resultInvoice);
        setInvoiceInInvoiceItems(resultInvoice);
        return resultInvoice;
    }

    private void setInvoiceInInvoiceItems(Invoice resultInvoice) {
        for (InvoiceItem invoiceItem : resultInvoice.getInvoiceItems()) {
            invoiceItem.setInvoice(resultInvoice);
        }
    }
}
