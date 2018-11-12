package com.solarexsoft.mvp


/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 15:49/2018/11/12
 *    Desc:
 * </pre>
 */

interface IPresenter<out View : IMvpView<IPresenter<View>>>:ILifecycle {
    val view: View
}

interface IMvpView<out Presenter : IPresenter<IMvpView<Presenter>>>:ILifecycle {
    val presenter: Presenter
}