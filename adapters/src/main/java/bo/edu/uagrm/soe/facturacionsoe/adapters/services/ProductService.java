package bo.edu.uagrm.soe.facturacionsoe.adapters.services;

import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.ProductRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.response.ProductResponseDto;

public interface ProductService extends CrudService<ProductRequestDto, ProductResponseDto, Exception> {

}
