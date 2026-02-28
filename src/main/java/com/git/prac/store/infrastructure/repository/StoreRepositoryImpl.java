package com.git.prac.store.infrastructure.repository;

import com.git.prac.store.domain.entity.StoreEntity;
import com.git.prac.store.domain.repository.StoreRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StoreRepositoryImpl implements StoreRepository {
    private final StoreJpaRepository storeJpaRepository;


    @Override
    public StoreEntity save(StoreEntity storeEntity) {
        return storeJpaRepository.save(storeEntity);
    }

    @Override
    public Optional<StoreEntity> findById(Long id) {
        return storeJpaRepository.findById(id);
    }
}
