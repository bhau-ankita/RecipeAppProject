package com.example.myrecipieapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun CategoryDetailScreen(category: Category
){
Column(modifier = Modifier
    .fillMaxSize()
    .padding(16.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
    ) {
   Text(text = category.strCategory, textAlign = TextAlign.Center)
    Image(
        painter = rememberAsyncImagePainter(category.strCategoryThumb),
        contentDescription = "${category.strCategoryDescription}Thumbail ",
        modifier = Modifier
            .wrapContentSize()
            .aspectRatio(1f)
    )// this is to display the image
    Text(text = category.strCategoryDescription, textAlign = TextAlign.Justify,
        modifier = Modifier.verticalScroll(rememberScrollState())
        ) // this is used to scrol the text and remember the scrol state


}
}