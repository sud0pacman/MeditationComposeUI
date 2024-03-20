package com.sudo_pacman.meditation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sudo_pacman.meditation.ui.screen.HomeScreen
import com.sudo_pacman.meditation.ui.theme.MeditationTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalStdlibApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationTheme {
                // A surface container using the 'background' color from the theme
               HomeScreen()
            }
        }
    }
}

//@OptIn(ExperimentalStdlibApi::class)
//@Preview(showBackground = true)
//@Composable
//fun HomeScreenPreview() {
//    MeditationTheme {
//        HomeScreen()
//    }
//}