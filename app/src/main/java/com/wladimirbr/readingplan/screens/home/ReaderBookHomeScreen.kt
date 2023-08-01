package com.wladimirbr.readingplan.screens.home

import android.annotation.SuppressLint

import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import com.wladimirbr.readingplan.components.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.wladimirbr.readingplan.model.MBook

import com.wladimirbr.readingplan.navigation.ReaderScreens


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")

@Composable
fun Home(
    navController: NavController,
    //viewModel
) {
    Scaffold(topBar = {
        ReaderAppBar(title = "A.Reader", navController = navController)
    },
        floatingActionButton = {
            FABContent {
                navController.navigate(ReaderScreens.SearchScreen.name)
            }
        }) {
        //content
        Surface(modifier = Modifier.fillMaxSize()) {
            HomeContent(navController)
        }
    }
}


@Composable
fun HomeContent(navController: NavController) {
    Column(Modifier.padding(2.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row(modifier = Modifier.align(alignment = Alignment.Start)) {
            TitleSection(label = "You  Reading \n" + " activity right... ")
        }
    }
}

@Composable
fun TitleSection(modifier: Modifier = Modifier, label: String) {
    Surface(modifier = modifier.padding(start = 5.dp, top = 1.dp)) {
        Column {
            Text(
                text = label,
                fontSize = 19.sp,
                fontStyle = FontStyle.Normal,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun ReadingRightNowArea(books: List<MBook>, navController: NavController) {

}


