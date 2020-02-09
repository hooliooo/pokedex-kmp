package com.julio.alorro.pokedex.api

import com.julio.alorro.pokedex.models.Pokemon
import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.get
import io.ktor.client.response.HttpResponse
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.native.concurrent.*

import kotlinx.serialization.json.Json

expect val APIEngine: HttpClient

class PokeAPI {

    companion object {

        val baseUrl: String = "https://pokeapi.co/api/v2"

        val client = HttpClient {
            install(JsonFeature) {
                serializer = KotlinxSerializer(Json.nonstrict)
            }
        }

    }

    private suspend fun getPokemon(id: Int): Pokemon {
        val response = client.get<Pokemon>("${baseUrl}/pokemon/${id}")
        return response
    }

    fun getPokemon(id: Int, callback: () -> Unit) {
        GlobalScope.launch {
            try {
                val pokemon = getPokemon(id)
            } catch (e: Throwable) {
                withContext(coroutineContext) {

                }
            }
        }
    }

}