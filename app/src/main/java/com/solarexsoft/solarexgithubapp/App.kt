package com.solarexsoft.solarexgithubapp

import android.app.Application
import android.content.ContextWrapper

/**
 * <pre>
 * Author: houruhou
 * CreatAt: 15:09/2018/11/12
 * Desc:
</pre> *
 */

object AppContext: ContextWrapper(INSTANCE)

private lateinit var INSTANCE:Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }
}
