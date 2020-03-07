package bo.edu.uagrm.soe.facturacionsoe.usecases.productprices;

import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Mediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.create.CreateProductPriceCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.delete.DeleteProductPriceByIdCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.getall.GetAllProductPricesQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.getbyid.GetProductPriceByIdQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.update.UpdateProductPriceCommand;

import java.util.List;

public interface ProductPriceMediator extends Mediator {

    List<ProductPrice> send(GetAllProductPricesQuery query);

    ProductPrice send(GetProductPriceByIdQuery query);

    ProductPrice send(CreateProductPriceCommand command);

    ProductPrice send(UpdateProductPriceCommand command);

    void send(DeleteProductPriceByIdCommand command);

}
