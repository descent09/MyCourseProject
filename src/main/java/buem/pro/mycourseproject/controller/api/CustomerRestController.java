package buem.pro.mycourseproject.controller.api;

import buem.pro.mycourseproject.model.Customer;
import buem.pro.mycourseproject.service.customer.impls.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping("/api/v1/customers")
@RestController
@CrossOrigin
public class CustomerRestController {
    @Autowired
    CustomerServiceImpl service;

    @GetMapping("/")
    public List<Customer> showAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Customer showOne(@PathVariable String id){
        return service.get(id);
    }

    @GetMapping("del/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping("/add")
    public Customer insertOne(@RequestBody Customer customer){
        return service.create(customer);
    }

    @PutMapping()
    public Customer updateOne(@RequestBody Customer customer){
        return service.update(customer);
    }
}
