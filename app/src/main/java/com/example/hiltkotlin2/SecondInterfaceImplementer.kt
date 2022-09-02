package com.example.hiltkotlin2

import javax.inject.Inject

class SecondInterfaceImplementer @Inject constructor() : MyInterface {
    override fun myPrintFunction(): String {
        return "My Second Interface Implementer"
    }
}