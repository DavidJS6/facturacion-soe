package bo.edu.uagrm.soe.facturacionsoe.dto.validated;

import bo.edu.uagrm.soe.facturacionsoe.dto.raw.ProductDto;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.LongObject;
import bo.edu.uagrm.soe.facturacionsoe.dto.validated.types.StringObject;

public class ValidatedProductDto {

    private StringObject codeObject;
    private StringObject nameObject;
    private StringObject descriptionObject;
    private LongObject productPriceIdObject;

    public ValidatedProductDto(ProductDto dto) {
        this.codeObject = new StringObject(dto.getCode());
        this.nameObject = new StringObject(dto.getName());
        this.descriptionObject = new StringObject(dto.getDescription());
        this.productPriceIdObject = new LongObject(dto.getProductPriceId());
    }

    public StringObject getCodeObject() {
        return codeObject;
    }

    public void setCodeObject(StringObject codeObject) {
        this.codeObject = codeObject;
    }

    public StringObject getNameObject() {
        return nameObject;
    }

    public void setNameObject(StringObject nameObject) {
        this.nameObject = nameObject;
    }

    public StringObject getDescriptionObject() {
        return descriptionObject;
    }

    public void setDescriptionObject(StringObject descriptionObject) {
        this.descriptionObject = descriptionObject;
    }

    public LongObject getProductPriceIdObject() {
        return productPriceIdObject;
    }

    public void setProductPriceIdObject(LongObject productPriceIdObject) {
        this.productPriceIdObject = productPriceIdObject;
    }
}
