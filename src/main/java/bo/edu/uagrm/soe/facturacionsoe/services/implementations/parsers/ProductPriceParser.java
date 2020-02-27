package bo.edu.uagrm.soe.facturacionsoe.services.implementations.parsers;

import bo.edu.uagrm.soe.facturacionsoe.database.models.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.dto.parsing.DtoEntityParserAbstractImpl;
import bo.edu.uagrm.soe.facturacionsoe.dto.request.ProductPriceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.response.ProductPriceResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductPriceParser extends DtoEntityParserAbstractImpl<ProductPriceRequestDto, ProductPriceResponseDto, ProductPrice> {

    @Override
    public ProductPriceResponseDto parseEntityToResponseDto(ProductPrice productPrice) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(productPrice, ProductPriceResponseDto.class);
    }

    @Override
    public ProductPrice parseRequestDtoToEntity(ProductPriceRequestDto productPriceRequestDto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(productPriceRequestDto, ProductPrice.class);
    }

}
