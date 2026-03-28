package com.git.prac.store.application.port.out;

import com.git.prac.store.domain.entity.Store;
import java.util.Optional;

public interface LoadStorePort {

    Optional<Store> findById(Long id);

}
