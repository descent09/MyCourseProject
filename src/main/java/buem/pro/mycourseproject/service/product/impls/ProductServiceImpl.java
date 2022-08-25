package buem.pro.mycourseproject.service.product.impls;

import buem.pro.mycourseproject.model.Product;
import buem.pro.mycourseproject.repositroy.product.ProductMongoRepository;
import buem.pro.mycourseproject.service.product.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    private LocalDateTime now = LocalDateTime.now();
    private List<Product> products = new ArrayList(
            Arrays.asList(
                    new Product("1", "Milk",  100, "Yes","It is milk", now, now),
                    new Product("2", "Meat", 200, "No","It is meat", now, now),
                    new Product("3", "Apple", 300, "Yes","It is apple",  now, now),
                    new Product("4", "Strawberry", 400, "Yes","It is strawberry",  now, now),
                    new Product("5", "Lemon", 500, "Yes","It is lemon", now, now),
                    new Product("6", "Watermelon", 600,"Yes", "It is watermelon", now,now)
            ));
    @Autowired
    ProductMongoRepository repository;

    @PostConstruct
    void init(){
        repository.saveAll(products);
    }

    @Override
    public Product create(Product product) {
        product.setCreatedAt(LocalDateTime.now());
        return repository.save(product);
    }

    @Override
    public Product update(Product product) {
        product.setUpdatedAt(LocalDateTime.now());
        return repository.save(product);
    }

    @Override
    public Product get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    public List<Product> saveAll(List<Product> products) {
       return repository.saveAll(products);
    }
}
