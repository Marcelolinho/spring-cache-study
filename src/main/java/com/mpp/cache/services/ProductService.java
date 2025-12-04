package com.mpp.cache.services;

import com.mpp.cache.dto.request.ProductRequestDto;
import com.mpp.cache.dto.response.ProductResponseDto;
import com.mpp.cache.entities.ProductEntity;
import com.mpp.cache.mapper.ProductMapper;
import com.mpp.cache.repositories.ProductRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<ProductResponseDto> listAllProductsWithoutCache(Pageable pageable) {
        return productRepository.findAll(pageable).map(ProductMapper::entityToResponseDto);
    }

    public ProductResponseDto listProductWithoutCache(String code) {
        return ProductMapper.entityToResponseDto(productRepository.findByCode(code));
    }

    @Cacheable("listProductsMemory")
    public Page<ProductResponseDto> listAllProductsMachineMemoryCache(Pageable pageable) {
        return productRepository.findAll(pageable).map(ProductMapper::entityToResponseDto);
    }

    @Cacheable("productMemory")
    public ProductResponseDto listProductMachineMemoryCache(String code)  {
        return ProductMapper.entityToResponseDto(productRepository.findByCode(code));
    }
}