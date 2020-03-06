package bo.edu.uagrm.soe.facturacionsoe.usecases.products;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.create.CreateProductCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.create.CreateProductCommandHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getbyid.GetProductByIdHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getbyid.GetProductByIdQuery;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.List;

public class ProductMediatorImpl implements ProductMediator {
    private GetAllProductsHandler getAllProductsHandler;
    private GetProductByIdHandler getProductByIdHandler;
    private CreateProductCommandHandler createProductCommandHandler;

    public ProductMediatorImpl(
            GetAllProductsHandler getAllProductsHandler,
            GetProductByIdHandler getProductByIdHandler,
            CreateProductCommandHandler createProductCommandHandler
    ) {
        this.getAllProductsHandler = getAllProductsHandler;
        this.getProductByIdHandler = getProductByIdHandler;
        this.createProductCommandHandler = createProductCommandHandler;
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
}
