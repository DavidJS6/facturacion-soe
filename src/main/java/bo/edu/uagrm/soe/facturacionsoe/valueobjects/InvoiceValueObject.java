package bo.edu.uagrm.soe.facturacionsoe.valueobjects;

import bo.edu.uagrm.soe.facturacionsoe.dto.request.InvoiceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.request.InvoiceItemRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.types.LongNotNull;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.types.StringNotNull;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.types.TimestampValueObject;

import java.util.ArrayList;
import java.util.List;

public class InvoiceValueObject extends AbstractValueObject<InvoiceRequestDto> {
    public InvoiceValueObject(InvoiceRequestDto value) {
        super(value);
    }

    @Override
    protected void validateValue(InvoiceRequestDto invoice) throws RuntimeException {
        new LongNotNull(invoice.getInvoiceNumber());
        new StringNotNull(invoice.getClientName());
        new LongNotNull(invoice.getNit());
        new PositiveDouble(invoice.getTotalAmount());
        new TimestampValueObject(invoice.getTimestamp());
        new StringNotNull(invoice.getStatus());
        new PaymentValueObject(invoice.getPayment());
        validateInvoiceItems(invoice.getInvoiceItems());
    }

    private List<InvoiceItemValueObject> validateInvoiceItems(List<InvoiceItemRequestDto> invoiceItems) {
        List<InvoiceItemValueObject> result = new ArrayList<>();
        for (InvoiceItemRequestDto invoiceItemDto : invoiceItems) {
            result.add(new InvoiceItemValueObject(invoiceItemDto));
        }
        return result;
    }
}