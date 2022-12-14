package buem.pro.mycourseproject.service.product.impls;

import buem.pro.mycourseproject.model.Product;
import buem.pro.mycourseproject.repositroy.product.ProductFakeRepository;
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
                    new Product("1", "name1", 100, true,"desc1", now, now),
                    new Product("2", "name2", 200, false,"desc2", now, now),
                    new Product("3", "name3", 300, true,"desc3", now, now),
                    new Product("4", "name4", 400, false,"desc4", now, now),
                    new Product("5", "name5", 500, true,"desc5", now, now)
            ));
    @Autowired
    ProductMongoRepository repository;

    //@PostConstruct
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
}
