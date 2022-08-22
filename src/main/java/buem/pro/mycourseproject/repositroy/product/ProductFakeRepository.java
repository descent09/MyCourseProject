package buem.pro.mycourseproject.repositroy.product;


import buem.pro.mycourseproject.model.Product;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class ProductFakeRepository {

    private LocalDateTime now = LocalDateTime.now();
    private List<Product> products = new ArrayList(
            Arrays.asList(
            new Product("1", "name1", 100, "Yes","desc1", now, now),
            new Product("2", "name2", 200, "No","desc2", now, now),
            new Product("3", "name3", 300, "Yes","desc3", now, now),
            new Product("4", "name4", 400, "No","desc4", now, now),
            new Product("5", "name5", 500, "Yes","desc5", now, now),
             new Product("6", "name6", 600, "Yes", "desc6", now, now)
    ));

    public List<Product> findAll(){
        return this.products;
    }

    public Product findById(String id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
    }

    public Product update(Product product) {
        this.deleteById(product.getId());
        product.setUpdatedAt(LocalDateTime.now());
        this.products.add(product);
        return product;
    }


    public void deleteById(String id) {
        Product product = this.findById(id);
        this.products.remove(product);
    }

    public Product save(Product product) {
        product.setId(UUID.randomUUID().toString());
        product.setCreatedAt(LocalDateTime.now());
        products.add(product);
        return product;
    }
}
