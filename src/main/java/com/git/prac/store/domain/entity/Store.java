package com.git.prac.store.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "p_store")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Store {
    @Id
    @Column(name = "store_id")
    private Long id;

    @Column(name = "name")
    private String name;
}
