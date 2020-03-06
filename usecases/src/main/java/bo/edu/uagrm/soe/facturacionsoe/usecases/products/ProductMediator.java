package bo.edu.uagrm.soe.facturacionsoe.usecases.products;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs.Mediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.create.CreateProductCommand;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsQuery;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getbyid.GetProductByIdQuery;

import java.util.List;

public interface ProductMediator extends Mediator {
    List<Product> send(GetAllProductsQuery query);

    Product send(GetProductByIdQuery query);

    Product send(CreateProductCommand command);

/*
    List<Product> send(GetAllProductsQuery query);

    List<Product> send(GetAllProductsQuery query);

    List<Product> send(GetAllProductsQuery query);
*/
}
