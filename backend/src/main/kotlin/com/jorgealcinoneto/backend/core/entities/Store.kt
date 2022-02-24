package com.jorgealcinoneto.backend.core.entities

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Store(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long,
    val code: String,
    val description: String?,
    val name: String?,
    val openingDate: Date?,
    val storeType: String?
)

