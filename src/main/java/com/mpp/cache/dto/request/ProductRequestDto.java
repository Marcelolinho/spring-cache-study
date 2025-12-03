package com.mpp.cache.dto.request;

import com.mpp.cache.entities.ProductImagesEntity;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRequestDto {

    private String code;
    private String name;
    private String description;
    private BigDecimal price;
    private Boolean available;
    private List<ProductSKURequestDto> productSKUs;
    private List<ProductImagesEntity> productImages;
}
