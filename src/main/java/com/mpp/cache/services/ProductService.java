package com.mpp.cache.services;

import com.mpp.cache.dto.request.ProductRequestDto;
import com.mpp.cache.dto.response.ProductResponseDto;
import com.mpp.cache.mapper.ProductMapper;
import com.mpp.cache.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductResponseDto> listAllProducts() {
        return productRepository.findAll().stream()
                .map(ProductMapper::entityToResponseDto)
                .toList();
    }

    public ProductResponseDto listProduct(ProductRequestDto requestDto) {
        return null;
    }
}