package buem.pro.mycourseproject.controller.ui.UICustomer;


import buem.pro.mycourseproject.service.customer.impls.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
