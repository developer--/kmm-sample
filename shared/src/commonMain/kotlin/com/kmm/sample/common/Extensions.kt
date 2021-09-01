package com.kmm.sample.common

/**
 * @Author: Jemo Mgebrishvili
 * @Date: 17.08.21
 */

expect val Any.isFrozen: Boolean

expect fun <T> T.freeze(): T

expect fun Any.ensureNeverFrozen()

expect fun logThreadName()
