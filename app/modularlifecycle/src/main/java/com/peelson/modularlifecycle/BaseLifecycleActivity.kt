package com.peelson.modularlifecycle

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.peelson.modularlifecycle.databinding.ActivityMainBinding

/**
 *
 *  @author peelson
 *  @date 2021/11/23
 */
abstract class BaseLifecycleActivity: AppCompatActivity() {
    var mainBinding: ActivityMainBinding? = null

    abstract val name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("onCreate() ==> savedInstanceState: $savedInstanceState")
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding?.root)
        mainBinding?.tvMainTitle?.text = name
    }

    override fun onDestroy() {
        super.onDestroy()
        log("onDestroy()")
    }

    override fun onResume() {
        super.onResume()
        log("onResume()")
    }

    override fun onPause() {
        super.onPause()
        log("onPause()")
    }

    override fun onRestart() {
        super.onRestart()
        log("onRestart()")
    }

    override fun onStop() {
        super.onStop()
        log("onStop()")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        log("onBackPressed()")
    }

    override fun onStart() {
        super.onStart()
        log("onStart()")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        log("onNewIntent() ==> intent: $intent")
    }

    override fun onPostResume() {
        super.onPostResume()
        log("onPostResume()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        log("onSaveInstanceState() ==> outState: $outState")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        log("onAttachedToWindow()")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        log("onDetachedFromWindow()")
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        log("onCreate(savedInstanceState: $savedInstanceState, persistentState: $persistentState)")
    }

    fun log(msg: String) = Log.d("LifeCycle_For_Peelson","$name :: $msg")
}