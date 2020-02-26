package bo.edu.uagrm.soe.facturacionsoe.valueobjects;

import bo.edu.uagrm.soe.facturacionsoe.dto.request.InvoiceItemRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.types.LongNotNull;

public class InvoiceItemValueObject extends AbstractValueObject<InvoiceItemRequestDto> {
    public InvoiceItemValueObject(InvoiceItemRequestDto value) {
        super(value);
    }

    @Override
    protected void validateValue(InvoiceItemRequestDto invoiceItemRequestDto) throws RuntimeException {
        new PositiveDouble(invoiceItemRequestDto.getUnitPrice());
        new PositiveDouble(invoiceItemRequestDto.getQuantity());
        new PositiveDouble(invoiceItemRequestDto.getItemAmount());
        new LongNotNull(invoiceItemRequestDto.getProductId());
    }
}
