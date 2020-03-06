package bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.cqrs.Request;

import java.util.List;

public class GetAllProductsQuery implements Request<List<Product>> {
}
