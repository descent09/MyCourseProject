package buem.pro.mycourseproject.service.custom.impls;

import buem.pro.mycourseproject.model.Custom;

import buem.pro.mycourseproject.model.Customer;
import buem.pro.mycourseproject.model.Product;
import buem.pro.mycourseproject.repositroy.custom.CustomMongoRepository;

import buem.pro.mycourseproject.service.custom.interfaces.ICustomService;
import buem.pro.mycourseproject.service.customer.impls.CustomerServiceImpl;
import buem.pro.mycourseproject.service.product.impls.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomServiceImpl implements ICustomService {
    @Autowired
    CustomerServiceImpl customerService;
    @Autowired
    ProductServiceImpl productService;
    private LocalDateTime now = LocalDateTime.now();

    private List<Custom> customs = new ArrayList<>();

    @Autowired
    CustomMongoRepository repository;

    @PostConstruct
    void init(){
        customs.add(new Custom("3",productService.get("2"),customerService.get("2"),4,now,now));
        customs.add(new Custom("4",productService.get("3"),customerService.get("3"),5,now,now));
        repository.saveAll(customs);
    }

    @Override
    public Custom create(Custom custom) {
        custom.setCreatedAt(LocalDateTime.now());
        return repository.save(custom);
    }

    @Override
    public Custom update(Custom custom) {
        custom.setUpdatedAt(LocalDateTime.now());
        return repository.save(custom);
    }

    @Override
    public Custom get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Custom> getAll() {
        return repository.findAll();
    }
}
