package com.wladimirbr.readingplan

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.firebase.firestore.FirebaseFirestore
import com.wladimirbr.readingplan.navigation.ReaderNavigation
import com.wladimirbr.readingplan.ui.theme.ReadingPlanTheme

import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ReadingPlanTheme {
                ReaderApp()
            }
        }
    }
}


@Composable
fun ReaderApp() {

    Surface(color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize(), content = {

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ReaderNavigation()

            }
        })

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ReadingPlanTheme {
    }
}