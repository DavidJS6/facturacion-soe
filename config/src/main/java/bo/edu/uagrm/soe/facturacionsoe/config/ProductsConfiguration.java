package bo.edu.uagrm.soe.facturacionsoe.config;

import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.ProductRepository;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.ProductMediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.ProductMediatorImpl;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductsConfiguration {

    @Bean("ProductMediator")
    public ProductMediator getGetAllProductsHandler(ProductRepository productRepository) {
        return new ProductMediatorImpl(new GetAllProductsHandler(productRepository));
    }

}
