package com.git.prac.store.application.service;

import com.git.prac.store.application.port.in.StoreCreateCommand;
import com.git.prac.store.application.port.in.StoreCreateResponse;
import com.git.prac.store.application.port.in.StoreUseCase;
import com.git.prac.store.application.port.out.LoadStorePort;
import com.git.prac.store.application.port.out.SaveStorePort;
import com.git.prac.store.domain.entity.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreService implements StoreUseCase {
    private final LoadStorePort loadStorePort;
    private final SaveStorePort saveStorePort;

    @Override
    public StoreCreateResponse createStore(StoreCreateCommand command) {
        Store store = Store.createStore(command.name());
        Store savedStore = saveStorePort.save(store);

        return new StoreCreateResponse(
                savedStore.getId(),
                savedStore.getName()
        );
    }
}
