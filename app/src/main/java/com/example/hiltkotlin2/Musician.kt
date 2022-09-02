package com.example.hiltkotlin2

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class Musician @Inject constructor(instrument: Instrument, band: Band) {
    fun sing(){
        println("la la la...")
    }
}