package com.example.hiltkotlin2

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

interface MyInterface {
    fun myPrintFunction(): String
}

// Method 1
/*
@Module
@InstallIn(ActivityComponent::class)
abstract class MyModule {

    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementer: InterfaceImplementer): MyInterface
}
 */

// Method 2
@Module
@InstallIn(SingletonComponent::class)
class MyModule {

    @Singleton
    @Provides
    fun providerFunction(): MyInterface {
        return InterfaceImplementer()
    }

    @Singleton
    @Provides
    fun gsonProvider(): Gson {
        return Gson()
    }
}