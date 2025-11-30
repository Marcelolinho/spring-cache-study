package com.mpp.cache.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cache_product_images")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductImagesEntity extends BaseEntity{

    @Column
    private String bucketName;

    @Column
    private String objectName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_product", nullable = false)
    private ProductEntity product;
}
