package bo.edu.uagrm.soe.facturacionsoe.usecases.products;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Mediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.create.CreateProductCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.delete.DeleteProductByIdCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getbyid.GetProductByIdQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.update.UpdateProductCommand;

import java.util.List;

public interface ProductMediator extends Mediator {
    List<Product> send(GetAllProductsQuery query);

    Product send(GetProductByIdQuery query);

    Product send(CreateProductCommand command);

    Product send(UpdateProductCommand command);

    void send(DeleteProductByIdCommand command);

/*
    List<Product> send(GetAllProductsQuery query);

    List<Product> send(GetAllProductsQuery query);

    List<Product> send(GetAllProductsQuery query);
*/
}
