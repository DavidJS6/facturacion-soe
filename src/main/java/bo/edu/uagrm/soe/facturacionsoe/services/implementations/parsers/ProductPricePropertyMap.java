package bo.edu.uagrm.soe.facturacionsoe.services.implementations.parsers;

import bo.edu.uagrm.soe.facturacionsoe.database.models.ProductPrice;
import bo.edu.uagrm.soe.facturacionsoe.dto.request.ProductPriceRequestDto;
import org.modelmapper.PropertyMap;

public class ProductPricePropertyMap extends PropertyMap<ProductPriceRequestDto, ProductPrice> {

    @Override
    protected void configure() {
        skip(destination.getId());
    }

}
