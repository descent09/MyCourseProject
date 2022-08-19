package buem.pro.mycourseproject.controller.api;

import buem.pro.mycourseproject.model.Product;
import buem.pro.mycourseproject.service.product.impls.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping("/api/v1/products")
@RestController
public class ProductRestController {

    @Autowired
    ProductServiceImpl service;

    @GetMapping("/")
    public List<Product> showAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public Product showOne(@PathVariable String id){
        return service.get(id);
    }
    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }
    @PostMapping()
    public Product insertOne(@RequestBody Product product){
        return service.create(product);
    }
    @PutMapping()
    public Product updateOne(@RequestBody Product product){
        return service.update(product);
    }
}
