package com.nativemodules

import android.widget.Toast
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class ToastModule (reactContext: ReactApplicationContext):
        ReactContextBaseJavaModule(reactContext){

            // Name of the module that will be used in JS
            override fun getName() = "ToastModule"

            // Method that will be exposed to JS
            @ReactMethod
            fun showToast(message: String, duration: String){
                val toastDuration = when (duration) {
                    "LONG" -> Toast.LENGTH_LONG
                    else -> Toast.LENGTH_SHORT
                }
                Toast.makeText(reactApplicationContext, message, toastDuration).show()
            }
        }