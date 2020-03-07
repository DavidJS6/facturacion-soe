package bo.edu.uagrm.soe.facturacionsoe.usecases.productprices;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.parsing.CommandToEntityParserImpl;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.create.CreateProductPriceCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.create.CreateProductCommand;
import org.modelmapper.ModelMapper;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

public class ProductPriceParser extends CommandToEntityParserImpl<CreateProductPriceCommand, ProductPrice> {

    @Override
    public ProductPrice parseCommandToEntity(CreateProductPriceCommand createProductPriceCommand) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(createProductPriceCommand, ProductPrice.class);
    }

}