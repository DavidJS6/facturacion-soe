package bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects;

import bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.create.CreateInvoiceItemCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.types.LongNotNull;

public class InvoiceItemValueObject extends AbstractValueObject<CreateInvoiceItemCommand> {
    public InvoiceItemValueObject(CreateInvoiceItemCommand value) {
        super(value);
    }

    @Override
    protected void validateValue(CreateInvoiceItemCommand invoiceItemRequestDto) throws RuntimeException {
        new PositiveDouble(invoiceItemRequestDto.getUnitPrice());
        new PositiveDouble(invoiceItemRequestDto.getQuantity());
        new PositiveDouble(invoiceItemRequestDto.getItemAmount());
        new LongNotNull(invoiceItemRequestDto.getProductId());
    }
}
