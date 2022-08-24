package buem.pro.mycourseproject.controller.ui.UICustom;

import buem.pro.mycourseproject.form.CustomForm;
import buem.pro.mycourseproject.form.ProductForm;
import buem.pro.mycourseproject.model.Custom;
import buem.pro.mycourseproject.model.Customer;
import buem.pro.mycourseproject.model.Product;
import buem.pro.mycourseproject.model.ProductType;
import buem.pro.mycourseproject.service.custom.impls.CustomServiceImpl;
import buem.pro.mycourseproject.service.customer.impls.CustomerServiceImpl;
import buem.pro.mycourseproject.service.product.impls.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/ui/UICustom/v1/customs")
@Controller
public class CustomUIController {
    @Autowired
    CustomServiceImpl service;
    @Autowired
    CustomerServiceImpl customerService;
    @Autowired
    ProductServiceImpl productService;



    @GetMapping("/")
    public String showAll(Model model){
        List<Custom> customs = service.getAll();
        model.addAttribute("customs",customs);
        return "customs";
    }



    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addCustom(Model model){
        CustomForm customForm = new CustomForm();
        var names = customerService.getAll()
                        .stream()
                        .map(customer -> customer.getCustomerName())
                        .collect(Collectors.toList());
        var products = productService.getAll()
                        .stream()
                        .map(product -> product.getName())
                        .collect(Collectors.toList());
        model.addAttribute("products", products);
        model.addAttribute("names",names);
        model.addAttribute("form", customForm);

        return "addCustom";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addCustom(Model model, @ModelAttribute("form") CustomForm form){
        String name = form.getCustomer();
        Customer customerFromDB = customerService.getAll()
                .stream().filter(customer -> customer.getCustomerName().equals(name))
                .findFirst().orElse(null);
        String productName = form.getProduct();
        Product productFromDB = productService.getAll()
                .stream().filter(product -> product.getName().equals(productName))
                .findFirst().orElse(null);
        Custom custom = new Custom();
        custom.setCustomer(customerFromDB);
        custom.setProduct(productFromDB);
        custom.setAmount(form.getAmount());
        service.create(custom);

        return "redirect:/ui/UICustom/v1/customs/";
    }



}
