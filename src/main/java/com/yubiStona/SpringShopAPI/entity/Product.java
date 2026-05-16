package com.yubiStona.SpringShopAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long categoryId;

    private Long adminId;
    private String title;
    private  String slug;
    private String description;
    private String sku;
    private double price;

    @Column(nullable = false)
    private Integer stockQuantity=0;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProductStatus status = ProductStatus.ACTIVE;

    private boolean isFeatured=false;
    private boolean isDeleted=false;

    @Column(name="deleted_at")
    private OffsetDateTime deletedAt;

    @CreationTimestamp
    @Column(name="created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt;

    @UpdateTimestamp
    @Column(name="updated_at")
    private  OffsetDateTime updatedAt;
}
