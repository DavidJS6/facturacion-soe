package bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects;

import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.InvoiceItemRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create.CreateInvoiceCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.types.LongNotNull;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.types.StringNotNull;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.types.TimestampValueObject;

import java.util.ArrayList;
import java.util.List;

public class InvoiceValueObject extends AbstractValueObject<CreateInvoiceCommand> {

    /*
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
    */

    public InvoiceValueObject(CreateInvoiceCommand value) {
        super(value);
    }

    @Override
    protected void validateValue(CreateInvoiceCommand invoice) throws RuntimeException {
        new LongNotNull(invoice.getInvoiceNumber());
        new StringNotNull(invoice.getClientName());
        new LongNotNull(invoice.getNit());
        new PositiveDouble(invoice.getTotalAmount());
        new TimestampValueObject(invoice.getTimestamp());
        new StringNotNull(invoice.getStatus());
        //new PaymentValueObject(invoice.getPayment());
        //validateInvoiceItems(invoice.getInvoiceItems());
    }

    private List<InvoiceItemValueObject> validateInvoiceItems(List<InvoiceItemRequestDto> invoiceItems) {
        List<InvoiceItemValueObject> result = new ArrayList<>();
        for (InvoiceItemRequestDto invoiceItemDto : invoiceItems) {
            result.add(new InvoiceItemValueObject(invoiceItemDto));
        }
        return result;
    }

}
