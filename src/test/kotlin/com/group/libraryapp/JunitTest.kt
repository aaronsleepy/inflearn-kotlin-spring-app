package com.group.libraryapp

import org.junit.jupiter.api.*

class JunitTest {
    companion object {
        @BeforeAll
        @JvmStatic
        fun beforeAll() {
            println("before all")
        }

        @AfterAll
        @JvmStatic
        fun afterAll() {
            println("after all")
        }
    }

    @BeforeEach
    fun beforeEach() {
        println("before each")
    }

    @AfterEach
    fun afterEach() {
        println("after each")
    }

    @Test
    fun test1() {
        println("test 1")
    }

    @Test
    fun test2() {
        println("test 2")
    }
}