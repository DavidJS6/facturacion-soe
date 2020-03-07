package bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.update;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.ProductPriceRepository;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.ProductRepository;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.ProductPriceParser;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.create.CreateProductPriceCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.ProductParser;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.create.CreateProductCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.ProductPriceValueObject;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.ProductValueObject;

public class UpdateProductPriceCommandHandler implements Handler<UpdateProductPriceCommand, ProductPrice> {

    private ProductPriceRepository<ProductPrice> repository;
    private ProductPriceParser parser;

    public UpdateProductPriceCommandHandler(ProductPriceRepository repository, ProductPriceParser parser) {
        this.repository = repository;
        this.parser = parser;
    }

    @Override
    public ProductPrice handleRequest(UpdateProductPriceCommand updateProductPriceCommand) {
        CreateProductPriceCommand createProductPriceCommand = new CreateProductPriceCommand(
                updateProductPriceCommand.getAmount(),
                updateProductPriceCommand.getStartTimestamp(),
                updateProductPriceCommand.getEndTimestamp(),
                updateProductPriceCommand.getActive(),
                updateProductPriceCommand.getProductId()
        );
        ProductPriceValueObject validatedProductPrice = new ProductPriceValueObject(createProductPriceCommand);
        CreateProductPriceCommand commandValue = validatedProductPrice.getValue();
        ProductPrice productPriceToUpdate = parser.parseCommandToEntity(commandValue);
        productPriceToUpdate.setId(updateProductPriceCommand.getId());
        // TODO: es posible hacer el siguiente proceso añadiendo una propiedad al modelMapper
        // -----------------------------
        Product product = new Product();
        product.setId(createProductPriceCommand.getProductId());

        productPriceToUpdate.setProduct(product);
        // -----------------------------
        return repository.save(productPriceToUpdate);
    }

}
