package bo.edu.uagrm.soe.facturacionsoe.usecases.products;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsQuery;

import java.util.List;

public class ProductMediatorImpl implements ProductMediator {

    private GetAllProductsHandler getAllProductsHandler;

    public ProductMediatorImpl(GetAllProductsHandler getAllProductsHandler) {
        this.getAllProductsHandler = getAllProductsHandler;
    }

    @Override
    public List<Product> send(GetAllProductsQuery query) {
        return null;
    }
}
