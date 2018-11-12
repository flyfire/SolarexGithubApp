package com.solarexsoft.solarexgithubapp

import com.solarexsoft.solarexgithubapp.common.otherwise
import com.solarexsoft.solarexgithubapp.common.yes
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun testBoolean() {
        false.yes{
            println("hello")
        }.otherwise {
            println("world")
        }
        (1==1).yes {
            println("1")
        }.otherwise {
            println("2")
        }
        (1==2).yes {
            println("3")
        }.otherwise {
            println("4")
        }
        val a = true.yes {
            1
        }.otherwise {
            2
        }
        assertEquals(a, 1)
        val b = false.yes {
            3
        }.otherwise {
            4
        }
        assertEquals(b, 4)
    }
}
