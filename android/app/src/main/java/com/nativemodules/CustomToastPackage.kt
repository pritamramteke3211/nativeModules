package com.nativemodules

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

class CustomToastPackage : ReactPackage {
    override fun createViewManagers(reactContext: ReactApplicationContext) :
            MutableList<ViewManager<*, *>> = mutableListOf()

    override fun createNativeModules(reactContext: ReactApplicationContext):
            MutableList<NativeModule> = mutableListOf(ToastModule(reactContext))
}