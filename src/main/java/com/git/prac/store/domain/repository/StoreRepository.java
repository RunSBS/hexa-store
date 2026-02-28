package com.git.prac.store.domain.repository;

import com.git.prac.store.domain.entity.StoreEntity;
import java.util.Optional;

public interface StoreRepository {
    StoreEntity save(StoreEntity storeEntity);
    Optional<StoreEntity> findById(Long id);
}
