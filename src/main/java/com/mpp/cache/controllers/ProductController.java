package com.mpp.cache.controllers;

import com.mpp.cache.dto.response.ProductResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {


    @GetMapping
    public List<ProductResponseDto> listAllProducts(@RequestParam(required = false) Boolean available) {

    }
}
