package com.example.hiltkotlin2

import javax.inject.Inject

class InterfaceImplementer @Inject constructor() : MyInterface {
    override fun myPrintFunction(): String {
        return "MyInterfaceImplementer"
    }
}