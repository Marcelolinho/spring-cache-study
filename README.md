# Spring Cache Redis Product Catalog

**Project Goal**: Build a read-heavy product catalog API using Spring Cache with Redis to practice `@Cacheable`, `@CachePut`, `@CacheEvict` on Product, ProductSKU, ProductImages, and ProductSKUImages entities under high request load. [web:16][memory:4]

## Quick Start (Tomorrow's Checklist)

- Create Spring Boot project with `spring-boot-starter-cache`, `spring-boot-starter-data-redis`, `spring-boot-starter-data-jpa`, H2 (dev DB).
- Run Redis locally (Docker: `docker run -p 6379:6379 redis`).
- Enable caching: `@EnableCaching` on main class.
- Configure `RedisCacheManager` bean with TTLs (60min products, 10min SKUs/images). [web:16][web:35]
- Seed DB with 20 products + SKUs + images.

## Core Entities & Relationships

- **Product**: id, name, category, price, active flag.
- **ProductSKU**: id, productId, skuCode, stock, variant (size/color).
- **ProductImages**: id, productId, url, isPrimary.
- **ProductSKUImages**: id, skuId, url, angle (front/back).

Use `@OneToMany` for natural joins in read endpoints. [memory:4]

## Key Endpoints to Implement (Read-Heavy Focus)

