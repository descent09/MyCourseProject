package buem.pro.mycourseproject.controller.api;

import buem.pro.mycourseproject.model.Product;
import buem.pro.mycourseproject.service.product.impls.ProductServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    @ApiOperation(value = "Get list of products")
    @ApiResponse(code = 200, message = "success")
    public List<Product> showAll(){
        return service.getAll();
    }
    @PostMapping("/all")
    public List<Product> saveAll(@RequestBody List<Product> products){
        return service.saveAll(products);
    }
    @GetMapping("/{id}")
    @ApiOperation(value = "Get product by ID")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success"),
            @ApiResponse(code = 404, message = "Item with such ID was not founded")
    })
    public Product showOne(@PathVariable String id){
        return service.get(id);
    }
    @GetMapping ("del/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }
    @PostMapping("/add")
    @ApiOperation(value = "Create new product")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    public Product insertOne(@RequestBody Product product){
        return service.create(product);
    }
    @PutMapping("/edit/{id}")
    public Product updateOne(@PathVariable String id, @RequestBody Product product){
        return service.update(product);
    }
}
