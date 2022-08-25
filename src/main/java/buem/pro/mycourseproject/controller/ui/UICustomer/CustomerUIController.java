package buem.pro.mycourseproject.controller.ui.UICustomer;



import buem.pro.mycourseproject.form.CustomerForm;
import buem.pro.mycourseproject.form.CustomerForm;
import buem.pro.mycourseproject.model.Customer;

import buem.pro.mycourseproject.model.Customer;
import buem.pro.mycourseproject.service.customer.impls.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/UICustomer/v1/customers")
@Controller
public class CustomerUIController {
    @Autowired
    CustomerServiceImpl service;

    @GetMapping("/")
    public String showAll(Model model){
        model.addAttribute("customers", service.getAll());
        return "customers";
    }

    @GetMapping("/del/{id}")
    public String deleteByID(@PathVariable("id") String id){
        service.delete(id);
        return "redirect:/ui/UICustomer/v1/customers/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addCustomer(Model model){
        CustomerForm customerForm = new CustomerForm();
        model.addAttribute("form", customerForm);
        return "addCustomer";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addCustomer(Model model, @ModelAttribute("form") CustomerForm form){
        Customer customer = new Customer();
        customer.setName(form.getName());
        customer.setAddress(form.getAddress());
        customer.setTelephoneNumber(form.getTelephoneNumber());
        customer.setCustomerName(form.getCustomerName());
        service.create(customer);
        return "redirect:/ui/UICustomer/v1/customers/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateCustomer(Model model, @PathVariable("id") String id){
        Customer customerToUpdate = service.get(id);
        CustomerForm customerForm = new CustomerForm();
        customerForm.setId(customerToUpdate.getId());
        customerForm.setName(customerToUpdate.getName());
        customerForm.setAddress(customerToUpdate.getAddress());
        customerForm.setTelephoneNumber(customerToUpdate.getTelephoneNumber());
        customerForm.setCustomerName(customerToUpdate.getCustomerName());
        customerForm.setUpdatedAt(customerToUpdate.getUpdatedAt());
        customerForm.setCreatedAt(customerToUpdate.getCreatedAt());
        model.addAttribute("form", customerForm);

        return "updateCustomer";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateCustomer(@ModelAttribute("form") CustomerForm form){
        Customer customerToUpdate = new Customer();
        customerToUpdate.setId(form.getId());
        customerToUpdate.setName(form.getName());
        customerToUpdate.setAddress(form.getAddress());
        customerToUpdate.setTelephoneNumber(form.getTelephoneNumber());
        customerToUpdate.setCustomerName(form.getCustomerName());
        customerToUpdate.setCreatedAt(LocalDateTime.now());
        customerToUpdate.setUpdatedAt(LocalDateTime.now());
        service.update(customerToUpdate);

        return "redirect:/ui/UICustomer/v1/customers/";
    }

}
