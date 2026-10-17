package com.example.tugasuserinput

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tugasuserinput.ui.theme.BiodataScreen
import com.example.tugasuserinput.ui.theme.TugasUserInputTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TugasUserInputTheme {
                BiodataScreen()
            }
        }
    }
}
