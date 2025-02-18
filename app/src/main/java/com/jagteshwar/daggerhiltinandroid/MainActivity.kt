package com.jagteshwar.daggerhiltinandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.hilt.navigation.compose.hiltViewModel
import com.jagteshwar.daggerhiltinandroid.presentation.MyViewModel
import com.jagteshwar.daggerhiltinandroid.ui.theme.DaggerHiltInAndroidTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DaggerHiltInAndroidTheme {
                val viewModel = hiltViewModel<MyViewModel>()
            }
        }
    }
}

