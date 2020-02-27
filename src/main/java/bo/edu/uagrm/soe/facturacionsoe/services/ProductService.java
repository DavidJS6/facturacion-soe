package bo.edu.uagrm.soe.facturacionsoe.services;

import bo.edu.uagrm.soe.facturacionsoe.dto.request.ProductRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.response.ProductResponseDto;

public interface ProductService extends CrudService<ProductRequestDto, ProductResponseDto, Exception> {

}
