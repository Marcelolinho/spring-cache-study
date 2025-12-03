package com.mpp.cache.dto.response;

import com.mpp.cache.entities.ProductSKUImagesEntity;
import com.mpp.cache.entities.enums.ColorSKUEnum;
import com.mpp.cache.entities.enums.SizeSKUEnum;

import java.math.BigDecimal;
import java.util.List;

public record ProductSKUResponseDto(Long id, String code, SizeSKUEnum sizeCode, ColorSKUEnum color, String name, String description, BigDecimal price, Boolean available, List<ProductSKUImagesEntity> productSkuImages) {
}
