package com.jorgealcinoneto.backend.application.entrypoints.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("stores")
class StoreRestController {

    @GetMapping("/")
    fun getStores(): String {
        return "OK"
    }
}