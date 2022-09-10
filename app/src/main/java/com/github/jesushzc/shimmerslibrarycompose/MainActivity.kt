package com.github.jesushzc.shimmerslibrarycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.github.jesushzc.shimmers_library.*
import com.github.jesushzc.shimmerslibrarycompose.ui.theme.ShimmersLibraryComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShimmersLibraryComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        InverseGridShimmer()
                        GridShimmer()
                        LinesShimmer()
                        SingleLineShimmer()
                        SingleShapeShimmer()
                    }
                }
            }
        }
    }
}