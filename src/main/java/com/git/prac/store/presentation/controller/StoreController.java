package com.git.prac.store.presentation.controller;

import com.git.prac.store.application.service.StoreServiceImpl;
import com.git.prac.store.domain.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;
}
