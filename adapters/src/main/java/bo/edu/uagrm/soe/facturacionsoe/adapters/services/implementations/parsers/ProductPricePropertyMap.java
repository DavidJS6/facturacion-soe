package bo.edu.uagrm.soe.facturacionsoe.adapters.services.implementations.parsers;

import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.adapters.dto.request.ProductPriceRequestDto;
import org.modelmapper.PropertyMap;

public class ProductPricePropertyMap extends PropertyMap<ProductPriceRequestDto, ProductPrice> {

    @Override
    protected void configure() {
        skip(destination.getId());
    }

}
