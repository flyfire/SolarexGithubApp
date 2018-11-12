package com.solarexsoft.mvp

import com.solarexsoft.mvp.impl.MainActivity
import com.solarexsoft.mvp.impl.MainFragment
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    fun testMvp() {
        val mainFragment = MainFragment()
        println(mainFragment)
        println(mainFragment.presenter)
        println(mainFragment.presenter.view)
        mainFragment.onResume()
    }

    @Test
    fun testActivityMvp() {
        val mainActivity = MainActivity()
        println(mainActivity)
        println(mainActivity.presenter)
        println(mainActivity.presenter.view)
//        mainActivity.onResume()
    }
}