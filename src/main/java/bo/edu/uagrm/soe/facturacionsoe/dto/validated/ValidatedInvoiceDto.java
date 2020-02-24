package bo.edu.uagrm.soe.facturacionsoe.dto.validated;

import bo.edu.uagrm.soe.facturacionsoe.dto.raw.InvoiceDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.raw.InvoiceItemDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.DoubleObject;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.LongObject;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.StringObject;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.TimestampObject;

import java.util.ArrayList;
import java.util.List;

public class ValidatedInvoiceDto {

    private LongObject invoiceNumberObject;
    private DoubleObject totalAmountObject;
    private TimestampObject timestampObject;
    private StringObject statusObject;
    private ValidatedPaymentDto payment;
    private List<ValidatedInvoiceItemDto> invoiceItemList;

    public ValidatedInvoiceDto(InvoiceDto invoiceDto) {
        this.invoiceNumberObject = new LongObject(invoiceDto.getInvoiceNumber());
        this.totalAmountObject = new DoubleObject(invoiceDto.getTotalAmount());
        this.timestampObject = new TimestampObject(invoiceDto.getTimestamp());
        this.statusObject = new StringObject(invoiceDto.getStatus());
        this.payment = new ValidatedPaymentDto(invoiceDto.getPayment());

        List<ValidatedInvoiceItemDto> detail = new ArrayList<>();
        for (InvoiceItemDto invoiceItemDto : invoiceDto.getInvoiceItemList()) {
            detail.add(new ValidatedInvoiceItemDto(invoiceItemDto));
        }
        this.invoiceItemList = detail;
    }

    public LongObject getInvoiceNumberObject() {
        return invoiceNumberObject;
    }

    public void setInvoiceNumberObject(LongObject invoiceNumberObject) {
        this.invoiceNumberObject = invoiceNumberObject;
    }

    public DoubleObject getTotalAmountObject() {
        return totalAmountObject;
    }

    public void setTotalAmountObject(DoubleObject totalAmountObject) {
        this.totalAmountObject = totalAmountObject;
    }

    public TimestampObject getTimestampObject() {
        return timestampObject;
    }

    public void setTimestampObject(TimestampObject timestampObject) {
        this.timestampObject = timestampObject;
    }

    public StringObject getStatusObject() {
        return statusObject;
    }

    public void setStatusObject(StringObject statusObject) {
        this.statusObject = statusObject;
    }

    public ValidatedPaymentDto getPayment() {
        return payment;
    }

    public void setPayment(ValidatedPaymentDto payment) {
        this.payment = payment;
    }

    public List<ValidatedInvoiceItemDto> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(List<ValidatedInvoiceItemDto> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }
}
