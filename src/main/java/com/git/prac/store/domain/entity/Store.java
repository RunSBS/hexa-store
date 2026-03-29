package com.git.prac.store.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "p_store")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // JPA를 위한 기본 생성자 (외부 호출 방지)
@AllArgsConstructor(access = AccessLevel.PRIVATE) // 전체 생성자는 내부에서만 사용
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Long id;

    @Column(name = "name")
    private String name;

    public Store(String name) {
        this.name = name;
    }
    // 도메인 생성 로직 (정적 팩토리 메서드)
    public static Store createStore(String name) {
        return new Store(null, name);
    }
}
