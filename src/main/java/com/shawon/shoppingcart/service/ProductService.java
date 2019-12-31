package com.shawon.shoppingcart.service;

import com.shawon.shoppingcart.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> findAllProductSortedByName();
}
