package com.peelson.papp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * 主要的工程入口
 *
 * @author peelson
 *
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}