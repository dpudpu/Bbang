package com.jmt.bbang.controller;

import com.jmt.bbang.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/product")
public class ProuductController {
    ProductService productService;

    @GetMapping("/hello")
    public String hello(){
        return "main";
    }

    @GetMapping("/list")
    public String list(Model model,
                       @RequestParam(value = "categoryid",defaultValue = "1")int categoryId,
                       @RequestParam(value = "page", defaultValue = "1")int page,
                       @RequestParam(value = "name", defaultValue = "")String name){


        model.addAttribute("products",productService.getProducts(categoryId));
//        model.addAttribute("products",productService.getProducts(name));

        model.addAttribute("categoriId",categoryId);
        model.addAttribute("page",page);
        model.addAttribute("totalPage");
        return "product/list";
    }

}
