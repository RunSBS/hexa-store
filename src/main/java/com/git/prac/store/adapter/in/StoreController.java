package com.git.prac.store.adapter.in;

import com.git.prac.store.application.port.in.StoreCreateCommand;
import com.git.prac.store.application.port.in.StoreCreateResponse;
import com.git.prac.store.application.port.in.StoreUseCase;
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
    public ResponseEntity<StoreWebResponse> createStore(@RequestBody StoreCreateRequest request) {
        StoreCreateCommand command = request.toCommand();

        StoreCreateResponse response = storeUseCase.createStore(command);
        return ResponseEntity.ok(StoreWebResponse.from(response));
    }
}
