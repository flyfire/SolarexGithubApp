package com.solarexsoft.common;

import junit.framework.Assert.assertEquals
import org.junit.Test;

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    fun testBoolean() {
        false.yes {
            println("hello")
        }.otherwise {
            println("world")
        }
        (1 == 1).yes {
            println("1")
        }.otherwise {
            println("2")
        }
        (1 == 2).yes {
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