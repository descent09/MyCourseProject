package buem.pro.mycourseproject.controller.api;

import buem.pro.mycourseproject.model.Custom;
import buem.pro.mycourseproject.service.custom.impls.CustomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/custom")
@RestController
public class CustomRestController {
    @Autowired
    CustomServiceImpl service;

    @GetMapping("/")
    public List<Custom> showAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Custom showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Custom insertOne(@RequestBody Custom custom){
        return service.create(custom);
    }

    @PutMapping()
    public Custom updateOne(@RequestBody Custom custom){
        return service.update(custom);
    }
}
