package com.solarexsoft.mvp.impl

import android.support.v4.app.Fragment
import com.solarexsoft.mvp.IMvpView
import com.solarexsoft.mvp.IPresenter
import kotlin.reflect.KClass
import kotlin.reflect.full.isSubclassOf
import kotlin.reflect.full.primaryConstructor
import kotlin.reflect.jvm.jvmErasure

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 16:25/2018/11/12
 *    Desc:
 * </pre>
 */
 
abstract class BaseFragment<out P: BasePresenter<BaseFragment<P>>>:IMvpView<P>, Fragment(){
    override val presenter: P

    init {
        presenter = createPresenterKt()
        presenter.view = this
    }

    fun createPresenterKt(): P {
        sequence {
            var thisClass: KClass<*> = this@BaseFragment::class
            while (true) {
                yield(thisClass.supertypes)
                thisClass = thisClass.supertypes.firstOrNull()?.jvmErasure ?: break
            }
        }.flatMap{
            it.flatMap{it.arguments}.asSequence()
        }.first{
            it.type?.jvmErasure?.isSubclassOf(IPresenter::class) ?: false
        }.let {
            return it.type!!.jvmErasure.primaryConstructor!!.call() as P
        }
    }
}

class MainFragment:BaseFragment<MainPresneter>()
class MainPresneter:BasePresenter<MainFragment>()