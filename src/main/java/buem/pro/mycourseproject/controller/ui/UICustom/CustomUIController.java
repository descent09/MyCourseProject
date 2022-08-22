package buem.pro.mycourseproject.controller.ui.UICustom;

import buem.pro.mycourseproject.service.product.impls.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ui/UICustom/v1/customs")
@Controller
public class CustomUIController {
    @Autowired
    ProductServiceImpl service;

    @GetMapping("/")
    public String showAll(){
        return "customs";
    }
}
