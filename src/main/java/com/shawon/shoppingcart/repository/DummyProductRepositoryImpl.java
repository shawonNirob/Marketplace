package com.shawon.shoppingcart.repository;

import com.shawon.shoppingcart.dto.ProductDTO;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class DummyProductRepositoryImpl implements ProductRepository {

    @Override
    public List<ProductDTO> findAllProducts() {
        return Arrays.asList(
                new ProductDTO("Apple iPad", "Apple Inc.", new BigDecimal("369.99")),
                new ProductDTO("Headphones", "Uisii china", new BigDecimal("249.99"))
        );
    }
}
