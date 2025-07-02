package com.example.rotasilayar

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.rotasilayar.ui.theme.RotasiLayarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("LIFECYCLE", "Created")
        // Ambil referensi TextView
        val textNames = findViewById<TextView>(R.id.textNames)

        // Buat daftar nama
        val names = listOf("Adhli", "Willman", "Leon")

        // Gabungkan dan tampilkan di TextView
        textNames.text = names.joinToString(separator = "\n")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LIFECYCLE", "Started")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LIFECYCLE", "Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LIFECYCLE", "Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LIFECYCLE", "Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LIFECYCLE", "Destroyed")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LIFECYCLE", "Restarted")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.d("CONFIG", "Orientation changed: Landscape")
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.d("CONFIG", "Orientation changed: Portrait")
        }
    }
}