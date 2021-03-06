package bo.edu.uagrm.soe.facturacionsoe.adapters.services.implementations.parsers;

import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.parsing.DtoEntityParserAbstractImpl;
import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.request.ProductPriceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.response.ProductPriceResponseDto;
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
    public ProductPrice parseRequestDtoToCommand(ProductPriceRequestDto productPriceRequestDto) {
        ModelMapper mapper = new ModelMapper();
        mapper.addMappings(new ProductPricePropertyMap());
        return mapper.map(productPriceRequestDto, ProductPrice.class);
    }

}
