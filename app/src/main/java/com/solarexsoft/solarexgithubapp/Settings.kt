package com.solarexsoft.solarexgithubapp

import com.solarexsoft.common.Preference

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 15:12/2018/11/12
 *    Desc:
 * </pre>
 */
object Settings{
    var email: String by Preference(AppContext, "email", "")
    var password: String by Preference(AppContext, "password", "")
}