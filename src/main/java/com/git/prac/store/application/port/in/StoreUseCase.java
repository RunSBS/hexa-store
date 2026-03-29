package com.git.prac.store.application.port.in;

public interface StoreUseCase {

    public StoreCreateResponse createStore(StoreCreateCommand request);
}
