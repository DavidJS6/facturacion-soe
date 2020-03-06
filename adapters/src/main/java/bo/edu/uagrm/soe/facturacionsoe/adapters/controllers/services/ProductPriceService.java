package bo.edu.uagrm.soe.facturacionsoe.adapters.controllers.services;

import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.ProductPriceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.response.ProductPriceResponseDto;

import java.util.List;

public interface ProductPriceService extends CrudService<ProductPriceRequestDto, ProductPriceResponseDto, Exception> {

    List<ProductPriceResponseDto> getAllActivePrices();

    List<ProductPriceResponseDto> getAllActivePricesByProductId(Long productId);

}
