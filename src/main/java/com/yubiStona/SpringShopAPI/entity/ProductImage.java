package com.yubiStona.SpringShopAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;

@Entity
@Table(name = "product_images")
@Getter
@Setter
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private String imageUrl;
    private boolean alt_text;
    private boolean isPrimary;
    private int sortOrder;

    @CreationTimestamp
    @Column(name="created_at")
    private OffsetDateTime createdAt;
}
