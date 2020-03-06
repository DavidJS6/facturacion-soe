package bo.edu.uagrm.soe.facturacionsoe.usecases.ports.repositories;

import bo.edu.uagrm.soe.facturacionsoe.entities.Product;

public interface ProductRepository<TProduct extends Product> extends CrudRepository<TProduct> {
}
