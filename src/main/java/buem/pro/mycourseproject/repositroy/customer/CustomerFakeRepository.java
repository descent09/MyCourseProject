package buem.pro.mycourseproject.repositroy.customer;


import buem.pro.mycourseproject.model.Customer;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class CustomerFakeRepository {
    private LocalDateTime now = LocalDateTime.now();
    private List<Customer> customers = new ArrayList(
            Arrays.asList(
                    new Customer("1", "name1", "address1", "+380501234567","Jhon",now,now),
                    new Customer("2", "name2", "address2", "+380501234567","Den", now, now),
                    new Customer("3", "name3", "address3", "+380501234567","Bob", now, now),
                    new Customer("4", "name4", "address4", "+380501234567","Ann", now, now),
                    new Customer("5", "name5", "address5", "+380501234567","Olivia", now, now)
            )
    );

    public List<Customer> findAll(){return this.customers;}

    public Customer findById(String id){
        return customers.stream().filter(customer -> customer.getId().equals(id)).findFirst().orElse(null);
    }

    public Customer update(Customer customer){
        this.deleteById(customer.getId());
        customer.setUpdatedAt(LocalDateTime.now());
        this.customers.add(customer);
        return customer;
    }

    public void deleteById(String id){
        Customer customer = this.findById(id);
        this.customers.remove(customer);
    }

    public Customer save(Customer customer){
        customer.setId(UUID.randomUUID().toString());
        customer.setCreatedAt(LocalDateTime.now());
        customers.add(customer);
        return customer;
    }

}
