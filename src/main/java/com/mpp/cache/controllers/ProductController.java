package com.mpp.cache.controllers;

import com.mpp.cache.dto.response.ProductResponseDto;
import com.mpp.cache.services.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public Page<ProductResponseDto> listAllProducts(Pageable pageable, @RequestParam(required = false) Boolean cache) {
        if (cache) {
            return productService.listAllProductsMachineMemoryCache(pageable);
        }
        return productService.listAllProductsWithoutCache(pageable);
    }

    @GetMapping("/{code}")
    public ProductResponseDto listProduct(@PathVariable String code, @RequestParam Boolean cache) {
        if (cache) {
            return productService.listProductMachineMemoryCache(code);
        }
        return productService.listProductWithoutCache(code);
    }
}
