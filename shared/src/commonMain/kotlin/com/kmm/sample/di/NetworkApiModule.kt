package com.kmm.sample.di

import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import io.ktor.client.features.observer.*
import io.ktor.client.statement.*
import kotlinx.serialization.json.Json
import org.koin.core.module.Module
import org.koin.dsl.module


fun getNetworkModule(): Module {
  return module {
    single {
      HttpClient {
        ResponseObserver { response ->
          val status = response.status.value
          println("HTTP status: $status - ${response.request.url}")
        }
        install(JsonFeature) {
          val json: Json = kotlinx.serialization.json.Json {
            ignoreUnknownKeys = true
          }
          serializer = KotlinxSerializer(json)
        }
        install(Logging) {
          logger = Logger.DEFAULT
          level = LogLevel.NONE
        }
      }
    }
  }
}
