package com.git.prac.store.adapter.in;

import com.git.prac.store.application.port.in.StoreUseCase;
import com.git.prac.store.domain.entity.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("stores")
public class StoreController {
    private final StoreUseCase storeUseCase;

    @PostMapping()
    public Long createStore(@RequestBody Store store) {
        return 1L;
    }
}
