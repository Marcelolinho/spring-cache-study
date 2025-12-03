package com.mpp.cache.dto.response;

import java.math.BigDecimal;

public record ProductResponseDto(Long id, String code, String name, String description, BigDecimal price, Boolean available) {
}
