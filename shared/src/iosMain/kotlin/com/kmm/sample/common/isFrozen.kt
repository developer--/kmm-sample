package com.kmm.sample.common

import platform.Foundation.NSThread
import kotlin.native.concurrent.ensureNeverFrozen
import kotlin.native.concurrent.freeze
import kotlin.native.concurrent.isFrozen

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 17.08.21
 */
actual val Any.isFrozen: Boolean
  get() = isFrozen

actual fun logThreadName() {
  println("Working on thread: " + NSThread.currentThread + " isMain ${NSThread.currentThread.isMainThread}")
}

actual fun Any.ensureNeverFrozen() {
  ensureNeverFrozen()
}
actual fun <T> T.freeze(): T {
  return freeze()
}