package com.git.prac.store.adapter.out;

import com.git.prac.store.application.port.out.LoadStorePort;
import com.git.prac.store.application.port.out.SaveStorePort;
import com.git.prac.store.domain.entity.Store;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StorePersistenceAdapter implements LoadStorePort, SaveStorePort  {
    private final StoreJpaRepository storeJpaRepository;

    @Override
    public Store save(Store store) {
        return storeJpaRepository.save(store);
    }

    @Override
    public Optional<Store> findById(Long id) {
        return storeJpaRepository.findById(id);
    }
}
