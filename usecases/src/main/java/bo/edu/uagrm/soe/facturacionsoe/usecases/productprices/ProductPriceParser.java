package bo.edu.uagrm.soe.facturacionsoe.usecases.productprices;

import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.parsing.CommandToEntityParserImpl;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.create.CreateProductPriceCommand;
import org.modelmapper.ModelMapper;

public class ProductPriceParser extends CommandToEntityParserImpl<CreateProductPriceCommand, ProductPrice> {

    @Override
    public ProductPrice parseCommandToEntity(CreateProductPriceCommand createProductPriceCommand) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(createProductPriceCommand, ProductPrice.class);
    }

}