package com.mpp.cache.dto.request;

import com.mpp.cache.entities.ProductSKUImagesEntity;
import com.mpp.cache.entities.enums.ColorSKUEnum;
import com.mpp.cache.entities.enums.SizeSKUEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductSKURequestDto {

    private String code;
    private SizeSKUEnum sizeCode;
    private ColorSKUEnum color;
    private String name;
    private String description;
    private BigDecimal price;
    private Boolean available;
    private List<ProductSKUImagesEntity> productSkuImages;
}
