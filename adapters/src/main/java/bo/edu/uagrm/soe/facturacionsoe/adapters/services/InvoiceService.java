package bo.edu.uagrm.soe.facturacionsoe.adapters.services;

import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.InvoiceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.response.InvoiceResponseDto;

public interface InvoiceService extends CrudService<InvoiceRequestDto, InvoiceResponseDto, Exception> {

    InvoiceResponseDto cancel(Long id) throws Exception;

}
