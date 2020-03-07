package bo.edu.uagrm.soe.facturacionsoe.usecases.productprices;

import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.create.CreateProductPriceCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.create.CreateProductPriceCommandHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.delete.DeleteProductPriceByIdCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.delete.DeleteProductPriceByIdCommandHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.getall.GetAllProductPricesHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.getall.GetAllProductPricesQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.getbyid.GetProductPriceByIdHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.getbyid.GetProductPriceByIdQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.update.UpdateProductPriceCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.update.UpdateProductPriceCommandHandler;

import java.util.List;

public class ProductPriceMediatorImpl implements ProductPriceMediator {

    private GetAllProductPricesHandler getAllProductPricesHandler;
    private GetProductPriceByIdHandler getProductPriceByIdHandler;
    private CreateProductPriceCommandHandler createProductPriceCommandHandler;
    private UpdateProductPriceCommandHandler updateProductPriceCommandHandler;
    private DeleteProductPriceByIdCommandHandler deleteProductPriceByIdCommandHandler;

    public ProductPriceMediatorImpl(GetAllProductPricesHandler getAllProductPricesHandler,
                                    GetProductPriceByIdHandler getProductPriceByIdHandler,
                                    CreateProductPriceCommandHandler createProductPriceCommandHandler,
                                    UpdateProductPriceCommandHandler updateProductPriceCommandHandler,
                                    DeleteProductPriceByIdCommandHandler deleteProductPriceByIdCommandHandler) {
        this.getAllProductPricesHandler = getAllProductPricesHandler;
        this.getProductPriceByIdHandler = getProductPriceByIdHandler;
        this.createProductPriceCommandHandler = createProductPriceCommandHandler;
        this.updateProductPriceCommandHandler = updateProductPriceCommandHandler;
        this.deleteProductPriceByIdCommandHandler = deleteProductPriceByIdCommandHandler;
    }

    @Override
    public List<ProductPrice> send(GetAllProductPricesQuery query) {
        return getAllProductPricesHandler.handleRequest(query);
    }

    @Override
    public ProductPrice send(GetProductPriceByIdQuery query) {
        return getProductPriceByIdHandler.handleRequest(query);
    }

    @Override
    public ProductPrice send(CreateProductPriceCommand command) {
        return createProductPriceCommandHandler.handleRequest(command);
    }

    @Override
    public ProductPrice send(UpdateProductPriceCommand command) {
        return updateProductPriceCommandHandler.handleRequest(command);
    }

    @Override
    public void send(DeleteProductPriceByIdCommand command) {
        deleteProductPriceByIdCommandHandler.handleRequest(command);
    }

}
