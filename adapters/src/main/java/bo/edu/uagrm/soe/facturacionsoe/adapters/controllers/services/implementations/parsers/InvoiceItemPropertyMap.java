package bo.edu.uagrm.soe.facturacionsoe.adapters.controllers.services.implementations.parsers;

import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.InvoiceItemRequestDto;
import bo.edu.uagrm.soe.facturacionsoe.entities.InvoiceItem;
import org.modelmapper.PropertyMap;

public class InvoiceItemPropertyMap extends PropertyMap<InvoiceItemRequestDto, InvoiceItem> {
    @Override
    protected void configure() {
        skip(destination.getId());
    }
}
