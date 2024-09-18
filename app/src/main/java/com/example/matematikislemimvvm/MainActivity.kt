package com.example.matematikislemimvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.matematikislemimvvm.ui.theme.MatematikIslemiMvvmTheme
import com.example.mvvmkullanimi.AnaSayfa
import com.example.mvvmkullanimi.AnaSayfaViewModel


class MainActivity : ComponentActivity() {
    val anaSayfaViewModel : AnaSayfaViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MatematikIslemiMvvmTheme {
                AnaSayfa(anaSayfaViewModel)
            }
        }
    }
}



