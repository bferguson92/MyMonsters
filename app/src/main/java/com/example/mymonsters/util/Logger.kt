package com.example.mymonsters.util

import android.util.Log

object Logger {
    fun test(testString: String) {
        Log.d(Constants.TAG_TEST, testString)
    }

    fun error(throwable: Throwable) {
        Log.e(Constants.TAG_ERROR, throwable.toString())
    }
}