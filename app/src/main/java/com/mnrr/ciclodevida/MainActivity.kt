package com.mnrr.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("cicloVida", "Ingresa a onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("cicloVida", "Ingresa a onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("cicloVida", "Ingresa a onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("cicloVida", "Ingresa a onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("cicloVida", "Ingresa a onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("cicloVida", "Ingresa a onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("cicloVida", "Ingresa a onDestroy")
    }
}