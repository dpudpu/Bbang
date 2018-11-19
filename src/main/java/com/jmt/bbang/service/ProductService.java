package com.jmt.bbang.service;

import com.jmt.bbang.domain.Product;
import com.jmt.bbang.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
@AllArgsConstructor
@Service
public class ProductService {
    ProductRepository productRepository;
    public Page<Product> getProducts(int categoryId) {
        Pageable pageable = PageRequest.of(0, 5);
        Page<Product> products = productRepository.findByCategoryId(1L, pageable);
        return products;
    }
}
