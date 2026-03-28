package com.git.prac.store.application.port.out;

import com.git.prac.store.domain.entity.Store;

public interface SaveStorePort {

    Store save(Store store);
}
