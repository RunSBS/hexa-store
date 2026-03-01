package com.git.prac.store.infrastructure.repository;

import com.git.prac.store.domain.entity.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreJpaRepository extends JpaRepository<StoreEntity,Long> {
}
