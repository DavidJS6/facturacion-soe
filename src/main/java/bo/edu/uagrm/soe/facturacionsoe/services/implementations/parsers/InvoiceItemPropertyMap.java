package bo.edu.uagrm.soe.facturacionsoe.services.implementations.parsers;

import bo.edu.uagrm.soe.facturacionsoe.database.models.InvoiceItem;
import bo.edu.uagrm.soe.facturacionsoe.dto.request.InvoiceItemRequestDto;
import org.modelmapper.PropertyMap;

public class InvoiceItemPropertyMap extends PropertyMap<InvoiceItemRequestDto, InvoiceItem> {
    @Override
    protected void configure() {
        skip(destination.getId());
    }
}
