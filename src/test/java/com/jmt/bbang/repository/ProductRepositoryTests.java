package com.jmt.bbang.repository;

import com.jmt.bbang.domain.Product;
import com.jmt.bbang.domain.ProductOption;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class ProductRepositoryTests {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductOptionRepository productOptionRepository;

    @Test
    public void 모두검색(){
        List<Product> products = productRepository.findAll();

        System.out.println("==================");
        for(Product p : products){
            System.out.println(p.getId()+", "+p.getProductName()+", "
                    +p.getPrice()+", "+p.getCategory().getName()+", ");
        }
        System.out.println("==================");
    }

    @Test
    public void categoryId로검색(){
        List<Product> products = productRepository.findByCategoryId(4L);
        System.out.println("==================");
        for(Product p : products){
            System.out.println(p.getId()+", "+p.getProductName()+", "
                    +p.getPrice());
        }
        System.out.println("==================");
    }

    @Test
    public void 이름으로검색(){
        List<Product> products = productRepository.findByProductNameContaining("빵");
        System.out.println("==================");
        for(Product p : products){
            System.out.println(p.getId()+", "+p.getProductName()+", "
                    +p.getPrice()+", "+p.getCategory().getName()+", ");
        }
        System.out.println("==================");
    }
    @Test
    public void 상세보기검색(){
        Product product = productRepository.getOne(1L);
        System.out.println(product.getProductName()+" "+product.getPrice()+"원");

        Set<ProductOption> productOptions = product.getProductOptions();
        for(ProductOption po : productOptions)
            System.out.println(po.getName()+" "+po.getDiscount());

    }
}
