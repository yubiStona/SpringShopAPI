package com.yubiStona.SpringShopAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table( name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="user_id", nullable = false)
    private Long userId;

    @Column(name = "order_number", nullable = false, unique = true, length = 50)
    private String orderNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private OrderStatus status = OrderStatus.PENDING;

    @Column(name = "total_amount", nullable = false, precision = 12, scale = 2)
    private BigDecimal totalAmount;

    @Column(name = "shipping_address_id")
    private Long shippingAddressId;

    @Column(name = "ship_recipient_name", nullable = false)
    private String shipRecipientName;

    @Column(name = "ship_phone", nullable = false)
    private String shipPhone;

    @Column(name = "ship_address_line1", nullable = false)
    private String shipAddressLine1;

    @Column(name = "ship_address_line2")
    private String shipAddressLine2;

    @Column(name = "ship_city", nullable = false, length = 100)
    private String shipCity;

    @Column(name = "ship_state", nullable = false, length = 100)
    private String shipState;

    @Column(name = "ship_postal_code", nullable = false, length = 20)
    private String shipPostalCode;

    @Column(name = "ship_country", nullable = false, length = 100)
    private String shipCountry;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;

}
