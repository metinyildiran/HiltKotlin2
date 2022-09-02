package com.example.hiltkotlin2

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample @Inject constructor(
    @FirstImplementer private val myInterfaceImplementer: MyInterface,
    private val gson: Gson,
    @SecondImplementer private val mySecondInterfaceImplementer: MyInterface
) {
    fun myFunction(): String {
        return "Working: ${myInterfaceImplementer.myPrintFunction()}"
    }

    fun secondFunction(): String {
        return "Working: ${mySecondInterfaceImplementer.myPrintFunction()}"
    }
}