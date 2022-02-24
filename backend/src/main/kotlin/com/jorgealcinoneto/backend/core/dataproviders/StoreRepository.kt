package com.jorgealcinoneto.backend.core.dataproviders

import com.jorgealcinoneto.backend.core.entities.Store
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StoreRepository : JpaRepository<Store, Long> {}
