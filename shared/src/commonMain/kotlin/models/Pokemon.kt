package com.julio.alorro.pokedex.models

import kotlinx.serialization.Serializable

@Serializable
data class Pokemon(val id: Int, val name: String)