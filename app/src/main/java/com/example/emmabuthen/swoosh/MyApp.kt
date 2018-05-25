package com.example.emmabuthen.swoosh

import android.app.Activity
import android.app.Application
import android.content.pm.ActivityInfo
import android.os.Bundle

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(object: ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
                activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
            }

            override fun onActivityPaused(activity: Activity?) {
            }

            override fun onActivityResumed(activity: Activity?) {
            }

            override fun onActivityDestroyed(activity: Activity?) {
            }

            override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
            }

            override fun onActivityStarted(activity: Activity?) {
            }

            override fun onActivityStopped(activity: Activity?) {
            }
        })
    }
}