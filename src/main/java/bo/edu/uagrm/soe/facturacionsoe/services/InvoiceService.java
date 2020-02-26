package bo.edu.uagrm.soe.facturacionsoe.services;

import bo.edu.uagrm.soe.facturacionsoe.dto.request.InvoiceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.response.InvoiceResponseDto;

public interface InvoiceService extends CrudService<InvoiceRequestDto, InvoiceResponseDto, Exception> {
    InvoiceResponseDto cancel(Long id) throws Exception;
}
