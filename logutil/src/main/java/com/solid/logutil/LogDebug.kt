package com.solid.logutil

import android.util.Log

const val TAG = "SUPER AWESOME APP"

class LogDebug {

    fun d(message: String){
        Log.d(TAG, message)
    }
}