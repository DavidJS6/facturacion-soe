package bo.edu.uagrm.soe.facturacionsoe.usecases.products.create;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Handler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.ProductRepository;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.ProductParser;
import bo.edu.uagrm.soe.facturacionsoe.usecases.valueobjects.ProductValueObject;

public class CreateProductCommandHandler implements Handler<CreateProductCommand, Product> {
    private ProductRepository<Product> repository;
    private ProductParser parser;

    public CreateProductCommandHandler(ProductRepository repository, ProductParser parser) {
        this.repository = repository;
        this.parser = parser;
    }

    @Override
    public Product handleRequest(CreateProductCommand createProductCommand) {
        ProductValueObject validatedInvoice = new ProductValueObject(createProductCommand);
        CreateProductCommand commandValue = validatedInvoice.getValue();
        Product productToSave = parser.parseCommandToEntity(commandValue);
        return repository.save(productToSave);
    }
}
