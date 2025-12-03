package com.mpp.cache.mapper;

import com.mpp.cache.dto.response.ProductResponseDto;
import com.mpp.cache.entities.ProductEntity;

public class ProductMapper {

    public static ProductResponseDto entityToResponseDto(ProductEntity e) {
        return new ProductResponseDto(
                e.getId(),
                e.getCode(),
                e.getName(),
                e.getDescription(),
                e.getPrice(),
                e.getAvailable()
        );
    }
}
