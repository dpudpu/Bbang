package com.jmt.bbang.repository;

import com.jmt.bbang.domain.ProductOption;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class ProductOptionRepositoryTests {
    @Autowired
    ProductOptionRepository productOptionRepository;

    @Test
    public void 일단그냥테스트(){
        Pageable pageable = PageRequest.of(0, 10);
        Page<ProductOption> productOptions = productOptionRepository.findByProductId(1L, pageable);

        System.out.println(productOptions.getTotalElements());
        System.out.println(productOptions.getTotalPages());
        System.out.println("----------");

        for(ProductOption articleGroup : productOptions){
            System.out.println(articleGroup.getId());
            System.out.println(articleGroup.getName());
        }
    }
    @Test
    public void 이름으로검색LIKE사용(){
        Pageable pageable = PageRequest.of(0, 3);
        Page<ProductOption> productOptions = productOptionRepository.findByNameContaining2("레드", pageable);

        System.out.println(productOptions.getTotalElements());
        System.out.println(productOptions.getTotalPages());
        System.out.println("----------");

        for(ProductOption articleGroup : productOptions){
            System.out.println(articleGroup.getId());
            System.out.println(articleGroup.getName());
            System.out.println("--------------");
        }
        System.out.println("================");
    }
//
//    @Test
//    public void 이름으로검색FetchJoin(){
//        Pageable pageable = PageRequest.of(0, 3);
//        Page<ProductOption> productOptions = productOptionRepository.findByNameContaining3("레드", pageable);
//
//        System.out.println(productOptions.getTotalElements());
//        System.out.println(productOptions.getTotalPages());
//        System.out.println("----------");
//
//        for(ProductOption articleGroup : productOptions){
//            System.out.println(articleGroup.getId());
//            System.out.println(articleGroup.getName());
//            System.out.println("--------------");
//        }
//        System.out.println("================");
//    }
}
