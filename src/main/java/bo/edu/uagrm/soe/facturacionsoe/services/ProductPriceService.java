package bo.edu.uagrm.soe.facturacionsoe.services;

import bo.edu.uagrm.soe.facturacionsoe.database.models.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.dto.request.ProductPriceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.response.ProductPriceResponseDto;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.ProductPriceValueObject;

import java.util.Collection;
import java.util.List;

public interface ProductPriceService extends CrudService<ProductPriceRequestDto, ProductPriceResponseDto, Exception> {

    List<ProductPriceResponseDto> getAllActivePrices();

    List<ProductPriceResponseDto> getAllActivePricesByProductId(Long productId);

}
