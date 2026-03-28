package com.git.prac.store.adapter.in;

import com.git.prac.store.domain.entity.Store;

public record StoreCreateResponse(
        Long storeId,
        String name
) {
    public static StoreCreateResponse from(Store store) {
        return new StoreCreateResponse(
                store.getId(),
                store.getName()
        );
    }
}

