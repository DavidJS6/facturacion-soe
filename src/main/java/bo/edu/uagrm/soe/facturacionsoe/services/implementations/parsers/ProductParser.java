package bo.edu.uagrm.soe.facturacionsoe.services.implementations.parsers;

import bo.edu.uagrm.soe.facturacionsoe.database.models.Product;
import bo.edu.uagrm.soe.facturacionsoe.dto.parsing.DtoEntityParserAbstractImpl;
import bo.edu.uagrm.soe.facturacionsoe.dto.request.ProductRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.response.ProductResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductParser extends DtoEntityParserAbstractImpl<ProductRequestDto, ProductResponseDto, Product> {

    @Override
    public ProductResponseDto parseEntityToResponseDto(Product product) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(product, ProductResponseDto.class);
    }

    @Override
    public Product parseRequestDtoToEntity(ProductRequestDto productRequestDto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(productRequestDto, Product.class);
    }

}
