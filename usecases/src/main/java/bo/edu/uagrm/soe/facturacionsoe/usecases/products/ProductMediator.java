package bo.edu.uagrm.soe.facturacionsoe.usecases.products;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.cqrs.Mediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsQuery;

import java.util.List;

public interface ProductMediator extends Mediator {
    List<Product> send(GetAllProductsQuery query);

/*
    List<Product> send(GetAllProductsQuery query);

    List<Product> send(GetAllProductsQuery query);

    List<Product> send(GetAllProductsQuery query);
*/
}
