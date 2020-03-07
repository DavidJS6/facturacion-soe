package bo.edu.uagrm.soe.facturacionsoe.usecases.products.update;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.ProductRepository;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.ProductParser;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.create.CreateProductCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.ProductValueObject;

public class UpdateProductCommandHandler implements Handler<UpdateProductCommand, Product> {

    private ProductRepository<Product> repository;
    private ProductParser parser;

    public UpdateProductCommandHandler(ProductRepository repository, ProductParser parser) {
        this.repository = repository;
        this.parser = parser;
    }

    @Override
    public Product handleRequest(UpdateProductCommand updateProductCommand) {
        CreateProductCommand createProductCommand = new CreateProductCommand(
                updateProductCommand.getCode(),
                updateProductCommand.getName(),
                updateProductCommand.getDescription()
        );
        ProductValueObject validatedInvoice = new ProductValueObject(createProductCommand);
        CreateProductCommand commandValue = validatedInvoice.getValue();
        Product productToUpdate = parser.parseCommandToEntity(commandValue);
        productToUpdate.setId(updateProductCommand.getId());
        return repository.save(productToUpdate);
    }

}
