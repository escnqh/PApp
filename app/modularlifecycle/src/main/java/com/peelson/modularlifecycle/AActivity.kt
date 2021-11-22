package com.peelson.modularlifecycle

import android.content.Intent
import android.os.Bundle

/**
 *
 *  @author peelson
 *  @date 2021/11/23
 */
class AActivity: BaseLifecycleActivity() {

    override val name: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding?.tvMainTitle?.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java).apply {
                setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS)
            })
        }
    }


}