package com.jmt.bbang.controller;

import com.jmt.bbang.domain.Product;
import com.jmt.bbang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/products")
public class    ProuductController {
    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public String list(ModelMap modelMap,
                       @RequestParam(value = "categoryid",defaultValue = "1")Long categoryId,
                       @RequestParam(value = "page", defaultValue = "1")int page,
                       @RequestParam(value = "size", defaultValue = "5")int size,
                       @RequestParam(value = "name", defaultValue = "")String name){


        Page<Product> products = productService.getProducts(categoryId, PageRequest.of(page-1, size));

        modelMap.addAttribute("products",products);

        int totalPages = products.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            modelMap.addAttribute("pageNumbers", pageNumbers);
        }
        modelMap.addAttribute("categoriId",categoryId);
        return "product/list";
    }


}
