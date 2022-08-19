package buem.pro.mycourseproject.service.customer.interfaces;



import buem.pro.mycourseproject.model.Customer;

import java.util.List;

public interface ICustomerService {
    Customer create(Customer customer);
    Customer update(Customer customer);
    Customer get(String id);
    void delete(String id);
    List<Customer> getAll();
}
