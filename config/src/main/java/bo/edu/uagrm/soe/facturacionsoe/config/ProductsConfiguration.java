package bo.edu.uagrm.soe.facturacionsoe.config;

import bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.usecase.ProductRepositoryImpl;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.ProductMediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.ProductMediatorImpl;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductsConfiguration {
    @Bean("ProductMediator")
    public ProductMediator getGetAllProductsHandler(GetAllProductsHandler getAllProductsHandler) {
        return new ProductMediatorImpl(getAllProductsHandler);
    }

    @Bean
    public GetAllProductsHandler getGetAllProductsHandler(ProductRepositoryImpl productRepository) {
        return new GetAllProductsHandler(productRepository);
    }
}
