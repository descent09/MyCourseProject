package buem.pro.mycourseproject.service.product.interfaces;

import buem.pro.mycourseproject.model.Product;

import java.util.List;

public interface IProductService {
    Product create(Product product);
    Product update(Product product);
    Product get(String id);
    void delete(String id);
    List<Product> getAll();
}
