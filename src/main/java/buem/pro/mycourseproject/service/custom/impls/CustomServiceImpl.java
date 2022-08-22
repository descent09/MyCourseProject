package buem.pro.mycourseproject.service.custom.impls;

import buem.pro.mycourseproject.model.Custom;

import buem.pro.mycourseproject.model.Customer;
import buem.pro.mycourseproject.model.Product;
import buem.pro.mycourseproject.repositroy.custom.CustomMongoRepository;

import buem.pro.mycourseproject.service.custom.interfaces.ICustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomServiceImpl implements ICustomService {
    Customer customer;
    Product product;
    private LocalDateTime now = LocalDateTime.now();

    private List<Custom> customs = new ArrayList(
            Arrays.asList(
                    new Custom(product, customer,"1", 1, now, now),
                    new Custom(product, customer,"2", 2, now, now),
                    new Custom(product, customer,"3", 3, now, now)
            )
    );
    @Autowired
    CustomMongoRepository repository;

    @PostConstruct
    void init(){
        
    }

    @Override
    public Custom create(Custom custom) {
        return repository.save(custom);
    }

    @Override
    public Custom update(Custom custom) {
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
