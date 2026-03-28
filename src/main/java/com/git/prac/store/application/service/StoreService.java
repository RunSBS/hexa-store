package com.git.prac.store.application.service;

import com.git.prac.store.adapter.in.StoreCreateRequest;
import com.git.prac.store.adapter.in.StoreCreateResponse;
import com.git.prac.store.application.port.in.StoreUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreService implements StoreUseCase {

    @Override
    public StoreCreateResponse createStore(StoreCreateRequest request) {
        return null;
    }
}
