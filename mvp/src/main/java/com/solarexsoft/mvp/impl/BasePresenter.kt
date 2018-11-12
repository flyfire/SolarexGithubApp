package com.solarexsoft.mvp.impl

import android.content.res.Configuration
import android.os.Bundle
import com.solarexsoft.mvp.IMvpView
import com.solarexsoft.mvp.IPresenter

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 15:59/2018/11/12
 *    Desc:
 * </pre>
 */

abstract class BasePresenter<out V : IMvpView<BasePresenter<V>>> : IPresenter<V> {

    override lateinit var view: @UnsafeVariance V

    override fun onCreate(savedInstanceState: Bundle?) = Unit
    override fun onSaveInstanceState(outState: Bundle) = Unit
    override fun onViewStateRestored(savedInstanceState: Bundle?) = Unit
    override fun onConfigurationChanged(newConfig: Configuration) = Unit
    override fun onStart() = Unit
    override fun onResume() = Unit
    override fun onPause() = Unit
    override fun onStop() = Unit
    override fun onDestroy() = Unit
}