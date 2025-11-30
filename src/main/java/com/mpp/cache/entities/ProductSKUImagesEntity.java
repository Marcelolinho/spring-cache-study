package com.mpp.cache.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cache_product_sku_images")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductSKUImagesEntity extends BaseEntity{

    @Column
    private String bucketName;

    @Column
    private String objectName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_product_sku", nullable = false)
    private ProductSKUEntity productSku;
}
