package bo.edu.uagrm.soe.facturacionsoe.config;

import bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories.ProductPriceRepository;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.ProductPriceMediator;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.ProductPriceMediatorImpl;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.ProductPriceParser;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.create.CreateProductPriceCommandHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.delete.DeleteProductPriceByIdCommandHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.getall.GetAllProductPricesHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.getbyid.GetProductPriceByIdHandler;
import bo.edu.uagrm.soe.facturacionsoe.usecases.productprices.update.UpdateProductPriceCommandHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductPricesConfiguration {

    @Bean("ProductPriceMediator")
    public ProductPriceMediator getGetAllProductPricesHandler(ProductPriceRepository productPriceRepository) {
        return new ProductPriceMediatorImpl(
                new GetAllProductPricesHandler(productPriceRepository),
                new GetProductPriceByIdHandler(productPriceRepository),
                new CreateProductPriceCommandHandler(productPriceRepository, new ProductPriceParser()),
                new UpdateProductPriceCommandHandler(productPriceRepository, new ProductPriceParser()),
                new DeleteProductPriceByIdCommandHandler(productPriceRepository)
        );
    }

}
