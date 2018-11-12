package com.solarexsoft.solarexgithubapp.common


/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 18:31/2018/11/10
 *    Desc:
 * </pre>
 */
sealed class BooleanExt<out T>

object Otherwise: BooleanExt<Nothing>()
class WithData<T>(val data: T): BooleanExt<T>()

inline fun <T> Boolean.yes(block: ()->T) =
        when {
            this -> WithData(block())
            else -> Otherwise
        }

inline fun <T> BooleanExt<T>.otherwise(block: ()->T): T =
    when(this) {
        is WithData ->  this.data
        is Otherwise -> block()
    }