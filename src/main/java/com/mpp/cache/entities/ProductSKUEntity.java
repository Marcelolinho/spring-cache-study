package com.mpp.cache.entities;

import com.mpp.cache.entities.enums.ColorSKUEnum;
import com.mpp.cache.entities.enums.SizeSKUEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "cache_products_sku", uniqueConstraints = {
        @UniqueConstraint(name = "ck_product_sku_code", columnNames = {"code"})
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductSKUEntity extends BaseEntity{

    @Column
    @NotNull
    private String code;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private SizeSKUEnum sizeCode;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private ColorSKUEnum color;

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

    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false)
    private ProductEntity product;

    @OneToMany(mappedBy = "productSku", cascade = CascadeType.ALL)
    private List<ProductSKUImagesEntity> productSkuImages;
}
