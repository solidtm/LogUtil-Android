package com.solid.errorutil

import android.util.Log

const val TAG = "SUPER AWESOME APP"

class ErrorDebug {
    fun e(message: String){
        Log.e(TAG, message)
    }
}