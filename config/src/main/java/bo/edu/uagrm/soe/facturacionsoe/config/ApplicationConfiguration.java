package bo.edu.uagrm.soe.facturacionsoe.config;

import bo.edu.uagrm.soe.facturacionsoe.adapters.controllers.ProductController;
import bo.edu.uagrm.soe.facturacionsoe.adapters.entities.ProductModel;
import bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring.ProductSpringRepository;
import bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.usecase.ProductRepositoryImpl;
import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.ProductMediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.ProductMediatorImpl;
import bo.edu.uagrm.soe.facturacionsoe.usecases.products.getall.GetAllProductsQuery;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@ComponentScan(basePackageClasses = {
        ProductController.class,
        ProductRepositoryImpl.class,
        ApplicationConfiguration.class
})
@EntityScan(basePackageClasses = {
        ProductModel.class,
        Product.class
})
@EnableJpaRepositories(basePackageClasses = {ProductSpringRepository.class})
@Configuration
@Import(ProductsConfiguration.class)
public class ApplicationConfiguration {


}
