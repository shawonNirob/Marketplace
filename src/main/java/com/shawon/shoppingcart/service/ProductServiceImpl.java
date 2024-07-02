package com.shawon.shoppingcart.service;

import com.shawon.shoppingcart.repository.ProductRepository;
import com.shawon.shoppingcart.dto.ProductDTO;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDTO> findAllProductSortedByName() {
        return productRepository.findAllProducts().stream()
                .sorted(Comparator.comparing(ProductDTO::getName))
                .collect(Collectors.toList());
    }
}

