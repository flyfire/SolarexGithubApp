package com.solarexsoft.common

import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 14:44/2018/11/12
 *    Desc:
 * </pre>
 */
class Preference<T>(val context: Context, val name: String,val default: T, val prefsName: String = "default"):ReadWriteProperty<Any?, T>{

    private val prefs by lazy {
        context.getSharedPreferences(prefsName, Context.MODE_PRIVATE)
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return getPreferences(name)
    }

    private fun getPreferences(key: String): T {
        return when(default) {
            is Int -> prefs.getInt(key, default)
            is Long -> prefs.getLong(key, default)
            is Float -> prefs.getFloat(key, default)
            is Boolean -> prefs.getBoolean(key, default)
            is String -> prefs.getString(key, default)
            else -> throw IllegalArgumentException("Unsupported type")
        } as T
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        putPreferences(name, value)
    }

    private fun putPreferences(key: String, value: T) {
        with(prefs.edit()) {
            when(value) {
                is Long -> putLong(key, value)
                is Int -> putInt(key, value)
                is Float -> putFloat(key, value)
                is String -> putString(key, value)
                is Boolean -> putBoolean(key, value)
                else -> throw IllegalArgumentException("Unsupported type")
            }
            apply()
        }
    }

}