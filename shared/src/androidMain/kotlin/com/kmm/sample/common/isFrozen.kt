package com.kmm.sample.common

actual val Any.isFrozen get() = false

actual fun logThreadName() {
  println("executing in thread => ${Thread.currentThread().name}")
}

actual fun Any.ensureNeverFrozen() {}

actual fun <T> T.freeze(): T {
  return this
}