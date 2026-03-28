package com.git.prac.store.adapter.in;

import com.git.prac.store.domain.entity.Store;

public record StoreCreateRequest(
        Long storeId,
        String name
) {
    public static StoreCreateRequest from(Store store) {
        return new StoreCreateRequest(
                store.getId(),
                store.getName()
        );
    }
}
