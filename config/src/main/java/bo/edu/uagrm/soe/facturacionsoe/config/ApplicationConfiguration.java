package bo.edu.uagrm.soe.facturacionsoe.config;

import bo.edu.uagrm.soe.facturacionsoe.adapters.controllers.ProductController;
import bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.spring.ProductSpringRepository;
import bo.edu.uagrm.soe.facturacionsoe.adapters.repositories.usecase.ProductRepositoryImpl;
import bo.edu.uagrm.soe.facturacionsoe.entities.Product;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackageClasses = {
        ProductController.class,
        ProductRepositoryImpl.class,
        ApplicationConfiguration.class
})
@EntityScan(basePackageClasses = {
        //ProductModel.class,
        Product.class
})
@EnableJpaRepositories(basePackageClasses = {ProductSpringRepository.class})
@Configuration
@Import(ProductsConfiguration.class)
public class ApplicationConfiguration {


}
