package com.solarexsoft.mvp

import android.content.res.Configuration
import android.os.Bundle

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 15:55/2018/11/12
 *    Desc:
 * </pre>
 */

interface ILifecycle {
    fun onCreate(savedInstanceState: Bundle?)

    fun onSaveInstanceState(outState: Bundle)

    fun onViewStateRestored(savedInstanceState: Bundle?)

    fun onConfigurationChanged(newConfig: Configuration)

    fun onStart()

    fun onResume()

    fun onPause()

    fun onStop()

    fun onDestroy()
}