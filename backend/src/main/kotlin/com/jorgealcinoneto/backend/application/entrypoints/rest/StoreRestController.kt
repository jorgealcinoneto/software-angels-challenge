package com.jorgealcinoneto.backend.application.entrypoints.rest

import com.jorgealcinoneto.backend.core.dataproviders.StoreRepository
import com.jorgealcinoneto.backend.core.entities.Store
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class StoreRestController(private val storeRepository: StoreRepository) {

    @PostMapping("/stores")
    fun createNewStore(@Valid @RequestBody store: Store): Store = storeRepository.save(store)
}