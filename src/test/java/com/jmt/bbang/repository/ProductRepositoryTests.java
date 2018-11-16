package com.jmt.bbang.repository;

import com.jmt.bbang.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class ProductRepositoryTests {
    @Autowired
    ProductRepository productRepository;

    @Test
    public void 모두검색(){
        List<Product> products = productRepository.findAll();

        System.out.println("==================");
        for(Product p : products){
            System.out.println(p.getId()+", "+p.getProductName()+", "
                    +p.getPrice()+", "+p.getCategory().getName()+", "+p.getCategory().getParent_id());
        }
        System.out.println("==================");
    }

    @Test
    public void categoryId로검색(){
        List<Product> products = productRepository.findByCategoryId(4L);
        System.out.println("==================");
        for(Product p : products){
            System.out.println(p.getId()+", "+p.getProductName()+", "
                    +p.getPrice()+", "+p.getCategory().getName()+", "+p.getCategory().getParent_id());
        }
        System.out.println("==================");

    }
}
