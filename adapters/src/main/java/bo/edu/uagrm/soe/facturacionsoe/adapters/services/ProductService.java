package bo.edu.uagrm.soe.facturacionsoe.adapters.services;

import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.request.ProductRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.response.ProductResponseDto;

public interface ProductService extends CrudService<ProductRequestDto, ProductResponseDto, Exception> {

}
