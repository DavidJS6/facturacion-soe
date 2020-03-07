package bo.edu.uagrm.soe.facturacionsoe.adapters.services;

import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.request.ProductPriceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.response.ProductPriceResponseDto;

import java.util.List;

public interface ProductPriceService extends CrudService<ProductPriceRequestDto, ProductPriceResponseDto, Exception> {

    List<ProductPriceResponseDto> getAllActivePrices();

    List<ProductPriceResponseDto> getAllActivePricesByProductId(Long productId);

}
