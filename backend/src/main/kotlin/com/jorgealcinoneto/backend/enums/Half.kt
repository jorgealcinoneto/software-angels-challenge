package com.jorgealcinoneto.backend.enums

import java.io.InvalidObjectException

enum class Half {
    H1, H2;

    companion object {
        fun String.toHalf(): Half {
            return when (this) {
                "H1" -> H1
                "H2" -> H2
                else -> throw InvalidObjectException("Invalid Half")
            }
        }
    }
}