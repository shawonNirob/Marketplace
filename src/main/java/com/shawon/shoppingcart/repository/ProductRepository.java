package com.shawon.shoppingcart.repository;

import com.shawon.shoppingcart.dto.ProductDTO;

import java.util.List;

public interface ProductRepository {
    List<ProductDTO> findAllProducts();
}
