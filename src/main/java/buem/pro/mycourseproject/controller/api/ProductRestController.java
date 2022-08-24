package buem.pro.mycourseproject.controller.api;

import buem.pro.mycourseproject.model.Product;
import buem.pro.mycourseproject.service.product.impls.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping("/api/v1/products")
@RestController
@CrossOrigin
public class ProductRestController {

    @Autowired
    ProductServiceImpl service;

    @GetMapping("/")
    public List<Product> showAll(){
        return service.getAll();
    }
    @PostMapping("/all")
    public List<Product> saveAll(@RequestBody List<Product> products){
        return service.saveAll(products);
    }
    @GetMapping("/{id}")
    public Product showOne(@PathVariable String id){
        return service.get(id);
    }

    @GetMapping ("del/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }
    @PostMapping("/add")
    public Product insertOne(@RequestBody Product product){
        return service.create(product);
    }
    @PutMapping()
    public Product updateOne(@RequestBody Product product){
        return service.update(product);
    }
}
