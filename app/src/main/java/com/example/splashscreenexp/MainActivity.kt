package com.example.splashscreenexp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.splashscreenexp.ui.theme.SplashScreenExpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * Creates a SplashScreen instance associated with this Activity and handles setting the theme to
         * R.attr.postSplashScreenTheme.
         * This needs to be called before Activity.setContentView.
         * */
        installSplashScreen()
        setContent {
            SplashScreenExpTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    MessageContent()
                }

            }
        }
    }
}

@Composable
fun MessageContent() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello World!",
            textAlign = TextAlign.Center,
            fontSize = MaterialTheme.typography.bodyLarge.fontSize
        )
    }

}

@Preview
@Composable
fun MessagePreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        MessageContent()
    }

}