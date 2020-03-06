package bo.edu.uagrm.soe.facturacionsoe.adapters.services.implementations.parsers;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.parsing.DtoEntityParserAbstractImpl;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.ProductRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.response.ProductResponseDto;
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
