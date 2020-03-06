package bo.edu.uagrm.soe.facturacionsoe.usecases.products;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.parsing.CommandToEntityParserImpl;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.create.CreateProductCommand;
import org.modelmapper.ModelMapper;

public class ProductParser extends CommandToEntityParserImpl<CreateProductCommand, Product> {
    @Override
    public Product parseCommandToEntity(CreateProductCommand createProductCommand) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(createProductCommand, Product.class);
    }
}
