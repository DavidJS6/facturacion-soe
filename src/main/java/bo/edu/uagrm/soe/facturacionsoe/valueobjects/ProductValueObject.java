package bo.edu.uagrm.soe.facturacionsoe.valueobjects;

import bo.edu.uagrm.soe.facturacionsoe.dto.request.ProductRequestDto;

public class ProductValueObject {
    private String50 codeObject;
    private String50 nameObject;
    private String50 descriptionObject;

    public ProductValueObject(ProductRequestDto dto) {
        this.codeObject = new String50(dto.getCode());
        this.nameObject = new String50(dto.getName());
        this.descriptionObject = new String50(dto.getDescription());
    }

    public String50 getCodeObject() {
        return codeObject;
    }

    public void setCodeObject(String50 codeObject) {
        this.codeObject = codeObject;
    }

    public String50 getNameObject() {
        return nameObject;
    }

    public void setNameObject(String50 nameObject) {
        this.nameObject = nameObject;
    }

    public String50 getDescriptionObject() {
        return descriptionObject;
    }

    public void setDescriptionObject(String50 descriptionObject) {
        this.descriptionObject = descriptionObject;
    }
}
