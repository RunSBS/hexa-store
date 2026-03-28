package com.git.prac.store.adapter.out;

import com.git.prac.store.domain.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreJpaRepository extends JpaRepository<Store,Long> {
}
