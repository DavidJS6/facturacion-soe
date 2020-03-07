package bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.create;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.ProductPriceRepository;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.ProductPriceParser;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.ProductPriceValueObject;

public class CreateProductPriceCommandHandler implements Handler<CreateProductPriceCommand, ProductPrice> {

    private ProductPriceRepository<ProductPrice> repository;
    private ProductPriceParser parser;

    public CreateProductPriceCommandHandler(ProductPriceRepository repository, ProductPriceParser parser) {
        this.repository = repository;
        this.parser = parser;
    }

    @Override
    public ProductPrice handleRequest(CreateProductPriceCommand createProductPriceCommand) {
        ProductPriceValueObject validatedProductPrice = new ProductPriceValueObject(createProductPriceCommand);
        CreateProductPriceCommand commandValue = validatedProductPrice.getValue();
        ProductPrice productPriceToSave = parser.parseCommandToEntity(commandValue);
        // TODO: es posible hacer el siguiente proceso añadiendo una propiedad al modelMapper
        // -----------------------------
        productPriceToSave.setId(null);

        Product product = new Product();
        product.setId(createProductPriceCommand.getProductId());

        productPriceToSave.setProduct(product);
        // -----------------------------
        return repository.save(productPriceToSave);
    }

}
