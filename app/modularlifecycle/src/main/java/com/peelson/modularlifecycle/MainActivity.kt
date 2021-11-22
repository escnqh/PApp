package com.peelson.modularlifecycle

import android.content.Intent
import android.os.Bundle

class MainActivity : BaseLifecycleActivity() {

    override val name: String
        get() = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding?.tvMainTitle?.setOnClickListener {
            startActivity(Intent(this, AActivity::class.java))
        }
    }
}