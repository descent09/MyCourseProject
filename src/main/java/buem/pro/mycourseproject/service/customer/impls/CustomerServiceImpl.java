package buem.pro.mycourseproject.service.customer.impls;

import buem.pro.mycourseproject.model.Customer;


import buem.pro.mycourseproject.repositroy.customer.CustomerMongoRepository;
import buem.pro.mycourseproject.service.customer.interfaces.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
    private LocalDateTime now = LocalDateTime.now();
    private List<Customer> customers = new ArrayList(
            Arrays.asList(
                    new Customer("1", "John01", "Green st. 14", "+380501234567","John",now,now),
                    new Customer("2", "Den02", "Yellow st. 7", "+380501234567","Den", now, now),
                    new Customer("3", "Bob03", "Downing st. 81", "+380501234567","Bob", now, now),
                    new Customer("4", "Ann04", "White st. 9", "+380501234567","Ann", now, now),
                    new Customer("5", "Olivia5", "Brown st. 1", "+380501234567","Olivia", now, now)
            )
    );
    @Autowired
    CustomerMongoRepository repository;

    @PostConstruct
    void init(){
        repository.saveAll(customers);
    }

    @Override
    public Customer create(Customer customer) {
        customer.setCreatedAt(LocalDateTime.now());
        return repository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        customer.setUpdatedAt(LocalDateTime.now());
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
