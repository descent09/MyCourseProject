package buem.pro.mycourseproject.service.customer.impls;

import buem.pro.mycourseproject.model.Customer;

import buem.pro.mycourseproject.repositroy.customer.CustomerFakeRepository;
import buem.pro.mycourseproject.repositroy.customer.CustomerMongoRepository;
import buem.pro.mycourseproject.service.customer.interfaces.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    CustomerMongoRepository repository;

    @PostConstruct
    void init(){

    }

    @Override
    public Customer create(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        return this.repository.findAll();
    }
}
