package com.yubiStona.SpringShopAPI.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DialectOverride;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "order_items")
@Getter
@Setter
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_title", nullable = false)
    private String productTitle;

    @Column(name="product_sku")
    private String productSku;

    @Column(name = "unit_price", nullable = false)
    private BigDecimal unitPrice;

    @Min(1)
    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private BigDecimal subTotal;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt;

}
