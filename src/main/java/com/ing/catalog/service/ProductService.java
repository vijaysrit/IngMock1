package com.ing.catalog.service;

import java.util.List;

import com.ing.catalog.dto.ProductDetailsResponseDTO;
import com.ing.catalog.dto.ProductResponseDto;


public interface ProductService {

	List<ProductResponseDto> getAllProducts(int categoryId);

	ProductDetailsResponseDTO getProductDetails(int productId);

}
