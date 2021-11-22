package com.peelson.modularframework

import android.util.Log

/**
 * Log 的扩展
 *
 *  @author peelson
 *  @date 2021/11/22
 */

/**
 * 默认 Tag
 */
const val DEFAULT_TAG = "Tag_For_Peelson"
private const val LOG_X_NULL = "Log_X_Null"
private const val LOG_X_UNDEFINED = "Log_X_Undefined"

sealed class LogCatLevel

object All : LogCatLevel()
object V : LogCatLevel()
object D : LogCatLevel()
object I : LogCatLevel()
object W : LogCatLevel()
object E : LogCatLevel()
object Null : LogCatLevel()

private fun Any?.toString(): String {
    if (null == this) {
        return LOG_X_NULL
    }
    return when (this) {
        is String, Int, Double, Float, Long, Boolean -> {
            this.toString()
        }
        // TODO: Added By Peelson 2021/11/22 支持其他类型的转换
        else -> {
            LOG_X_UNDEFINED
        }
    }
}

private fun internalPrint(level: LogCatLevel, tag: String = DEFAULT_TAG, obj: Any?) {
    when (level) {
        is All, V -> Log.v(tag, obj.toString())
        is D -> Log.d(tag, obj.toString())
        I -> Log.i(tag, obj.toString())
        W -> Log.w(tag, obj.toString())
        E -> Log.e(tag, obj.toString())
        Null -> {
            // no-op
        }
    }
}

fun Any.print(level: LogCatLevel = D, tag: String = DEFAULT_TAG, obj: Any?) =
    internalPrint(level, tag, obj)

