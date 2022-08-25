package buem.pro.mycourseproject.controller.ui.UIProduct;

import buem.pro.mycourseproject.form.ProductForm;
import buem.pro.mycourseproject.model.Product;
import buem.pro.mycourseproject.service.product.impls.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


@RequestMapping("/ui/UIProduct/v1/products")
@Controller
public class ProductUIController {
    @Autowired
    ProductServiceImpl service;

    @GetMapping("/")
    public String showAll(Model model){
        model.addAttribute("products", service.getAll());
        return "products";
    }

    @GetMapping("/del/{id}")
    public String deleteByID(@PathVariable("id") String id){
        service.delete(id);
        return "redirect:/ui/UIProduct/v1/products/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProduct(Model model){
        ProductForm productForm = new ProductForm();


        model.addAttribute("form", productForm);
        return "addProduct";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addProduct(Model model, @ModelAttribute("form") ProductForm form){
        Product product = new Product();
        product.setName(form.getName());
        product.setPrice(form.getPrice());
        product.setDeliverAbility(form.getDeliverAbility());
        product.setDescription(form.getDescription());
        //product.setType(form.getType());
        service.create(product);
        return "redirect:/ui/UIProduct/v1/products/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateProduct(Model model, @PathVariable("id") String id){
        Product productToUpdate = service.get(id);
        ProductForm productForm = new ProductForm();
        productForm.setId(productToUpdate.getId());
        productForm.setName(productToUpdate.getName());
        productForm.setPrice(productToUpdate.getPrice());
        productForm.setDeliverAbility(productToUpdate.getDeliverAbility());
        productForm.setDescription(productToUpdate.getDescription());
        productForm.setUpdatedAt(productToUpdate.getUpdatedAt());
        productForm.setCreatedAt(productToUpdate.getCreatedAt());
        model.addAttribute("form", productForm);

        return "updateProduct";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateProduct(@ModelAttribute("form") ProductForm form){
        Product productToUpdate = new Product();
        productToUpdate.setId(form.getId());
        productToUpdate.setName(form.getName());
        productToUpdate.setPrice(form.getPrice());
        productToUpdate.setDeliverAbility(form.getDeliverAbility());
        productToUpdate.setDescription(form.getDescription());
        productToUpdate.setCreatedAt(LocalDateTime.now());
        productToUpdate.setUpdatedAt(LocalDateTime.now());
        service.update(productToUpdate);

        return "redirect:/ui/UIProduct/v1/products/";
    }

}
