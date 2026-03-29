package com.git.prac.store.adapter.in;

import com.git.prac.store.application.port.in.StoreCreateResponse;

public record StoreWebResponse(
        Long storeId,
        String name
) {
    public static StoreWebResponse from(StoreCreateResponse store) {
        return new StoreWebResponse(
                store.id(),
                store.name()
        );
    }
}

