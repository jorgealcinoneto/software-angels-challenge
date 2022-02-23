package com.jorgealcinoneto.backend.core.entities

import java.util.*

data class Store(
    val id: String,
    val externalId: String,
    val code: String?,
    val description: String?,
    val name: String?,
    val openingDate: Date?,
    val type: String?,
    val extraFields: Map<String, String?> = emptyMap(),
    val seasons: Set<String> = emptySet()
)

