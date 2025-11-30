package com.mpp.cache.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "cache_products", uniqueConstraints = {
        @UniqueConstraint(name = "ck_product_code", columnNames = {"code"})
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity extends BaseEntity{

    @Column
    @NotNull
    private String code;

    @Column
    @NotNull
    private String name;

    @Column
    private String description;

    @Column
    private BigDecimal price;

    @Column
    @NotNull
    private Boolean available;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductImagesEntity> productImages;
}
