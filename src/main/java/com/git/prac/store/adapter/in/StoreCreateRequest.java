package com.git.prac.store.adapter.in;

import com.git.prac.store.application.port.in.StoreCreateCommand;

public record StoreCreateRequest(
        String name
) {
    public StoreCreateCommand toCommand() {
        return new StoreCreateCommand(name);
    }
}
