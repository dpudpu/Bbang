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
    public void 회원번호로검색(){
        Product product = productRepository.findBytId(1L);



            System.out.println(product.getProductName());
            System.out.println(product.getId());

    }
}
