package com.example.jetpackcomposeinsets

import android.app.Activity
import android.os.Handler
import android.view.inputmethod.InputMethodManager

fun Activity.openKeyboardInOneSecond() {
    android.os.Looper.myLooper()?.let {
        Handler(it).postDelayed({
            val imm: InputMethodManager =
                getSystemService(android.content.Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.toggleSoftInput(android.view.inputmethod.InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
        }, 1000)
    }
}