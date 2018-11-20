package com.jmt.bbang.controller;

import com.jmt.bbang.domain.Product;
import com.jmt.bbang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/products")
public class ProuductController {
    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public String list(ModelMap modelMap,
                       @RequestParam(value = "categoryid",defaultValue = "1")Long categoryId,
                       @RequestParam(value = "page", defaultValue = "1")int page,
                       @RequestParam(value = "name", defaultValue = "")String name){
        Page<Product> products = productService.getProducts(categoryId, page);


        modelMap.addAttribute("products",products);
//        model.addAttribute("products",productService.getProducts(name));

        modelMap.addAttribute("categoriId",categoryId);
        modelMap.addAttribute("page",page);
        modelMap.addAttribute("totalPage",products.getTotalPages());
        return "product/list";
    }


}
