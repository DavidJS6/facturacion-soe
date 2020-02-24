package bo.edu.uagrm.soe.facturacionsoe.dto.validated;

import bo.edu.uagrm.soe.facturacionsoe.dto.raw.InvoiceItemDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.DoubleObject;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.LongObject;

public class ValidatedInvoiceItemDto {

    private DoubleObject unitPriceObject;
    private DoubleObject quantityObject;
    private DoubleObject itemAmountObject;
    private LongObject productIdObject;

    public ValidatedInvoiceItemDto(InvoiceItemDto invoiceItemDto) {
        this.unitPriceObject = new DoubleObject(invoiceItemDto.getUnitPrice());
        this.quantityObject = new DoubleObject(invoiceItemDto.getQuantity());
        this.itemAmountObject = new DoubleObject(invoiceItemDto.getItemAmount());
        this.productIdObject = new LongObject(invoiceItemDto.getProductId());
    }

    public DoubleObject getUnitPriceObject() {
        return unitPriceObject;
    }

    public void setUnitPriceObject(DoubleObject unitPriceObject) {
        this.unitPriceObject = unitPriceObject;
    }

    public DoubleObject getQuantityObject() {
        return quantityObject;
    }

    public void setQuantityObject(DoubleObject quantityObject) {
        this.quantityObject = quantityObject;
    }

    public DoubleObject getItemAmountObject() {
        return itemAmountObject;
    }

    public void setItemAmountObject(DoubleObject itemAmountObject) {
        this.itemAmountObject = itemAmountObject;
    }

    public LongObject getProductIdObject() {
        return productIdObject;
    }

    public void setProductIdObject(LongObject productIdObject) {
        this.productIdObject = productIdObject;
    }
}
