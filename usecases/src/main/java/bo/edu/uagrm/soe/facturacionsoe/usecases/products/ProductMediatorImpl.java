package bo.edu.uagrm.soe.facturacionsoe.usecases.products;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.create.CreateProductCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.create.CreateProductCommandHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.delete.DeleteProductByIdCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.delete.DeleteProductByIdCommandHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getbyid.GetProductByIdHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getbyid.GetProductByIdQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.update.UpdateProductCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.update.UpdateProductCommandHandler;

import java.util.List;

public class ProductMediatorImpl implements ProductMediator {
    private GetAllProductsHandler getAllProductsHandler;
    private GetProductByIdHandler getProductByIdHandler;
    private CreateProductCommandHandler createProductCommandHandler;
    private UpdateProductCommandHandler updateProductCommandHandler;
    private DeleteProductByIdCommandHandler deleteProductByIdCommandHandler;

    public ProductMediatorImpl(
            GetAllProductsHandler getAllProductsHandler,
            GetProductByIdHandler getProductByIdHandler,
            CreateProductCommandHandler createProductCommandHandler,
            UpdateProductCommandHandler updateProductCommandHandler,
            DeleteProductByIdCommandHandler deleteProductByIdCommandHandler
    ) {
        this.getAllProductsHandler = getAllProductsHandler;
        this.getProductByIdHandler = getProductByIdHandler;
        this.createProductCommandHandler = createProductCommandHandler;
        this.updateProductCommandHandler = updateProductCommandHandler;
        this.deleteProductByIdCommandHandler = deleteProductByIdCommandHandler;
    }

    @Override
    public List<Product> send(GetAllProductsQuery query) {
        return getAllProductsHandler.handleRequest(query);
    }

    @Override
    public Product send(GetProductByIdQuery query) {
        return getProductByIdHandler.handleRequest(query);
    }

    @Override
    public Product send(CreateProductCommand command) {
        return createProductCommandHandler.handleRequest(command);
    }

    @Override
    public Product send(UpdateProductCommand command) {
        return updateProductCommandHandler.handleRequest(command);
    }

    @Override
    public void send(DeleteProductByIdCommand command) {
        deleteProductByIdCommandHandler.handleRequest(command);
    }
}
