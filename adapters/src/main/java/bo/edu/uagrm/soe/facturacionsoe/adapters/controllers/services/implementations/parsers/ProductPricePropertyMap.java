package bo.edu.uagrm.soe.facturacionsoe.adapters.controllers.services.implementations.parsers;

import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.ProductPriceRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import org.modelmapper.PropertyMap;

public class ProductPricePropertyMap extends PropertyMap<ProductPriceRequestDto, ProductPrice> {

    @Override
    protected void configure() {
        skip(destination.getId());
    }

}
