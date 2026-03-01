package com.git.prac.store.application.service;

import com.git.prac.store.domain.entity.StoreEntity;
import com.git.prac.store.domain.repository.StoreRepository;
import com.git.prac.store.domain.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {
    private final StoreRepository storeRepository;

//    @Override
//    public Long CreateStore(StoreEntity storeEntity) {
//        return 0L;
//    }
}
