package bo.edu.uagrm.soe.facturacionsoe.adapters.entities;

import bo.edu.uagrm.soe.facturacionsoe.entities.ProductPrice;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

public class ProductPriceModel extends ProductPrice {
    public ProductPriceModel() {
        super();
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public Double getAmount() {
        return super.getAmount();
    }

    @Override
    public Timestamp getStartTimestamp() {
        return super.getStartTimestamp();
    }

    @Override
    public Timestamp getEndTimestamp() {
        return super.getEndTimestamp();
    }

    @Override
    public Boolean getActive() {
        return super.getActive();
    }

    /*
    @Override
    public ProductModel getProduct() {
        return super.getProduct();
    }

    @Override
    public void setProduct(ProductModel product) {
        super.setProduct(product);
    }
    */

}
