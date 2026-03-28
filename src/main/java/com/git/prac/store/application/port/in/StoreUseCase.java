package com.git.prac.store.application.port.in;

import com.git.prac.store.adapter.in.StoreCreateRequest;
import com.git.prac.store.adapter.in.StoreCreateResponse;

public interface StoreUseCase {

    public StoreCreateResponse createStore(StoreCreateRequest request);
}
