package com.yubiStona.SpringShopAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Entity
@Table(name = "user_addresses")
@Getter
@Setter
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name="recipient_name")
    private String recipientName;

    private String phone;

    private String address_lin1;
    private String address_lin2;
    private String city;
    private String state;
    private String country;
    private String postal_code;

    @Column(name = "is_default")
    private boolean isDefault;

    @CreationTimestamp
    @Column(name="created_at", nullable = false, updatable = false )
    private OffsetDateTime createdAt;

    @UpdateTimestamp
    @Column(name="updated_at")
    private OffsetDateTime updatedAt;

}
