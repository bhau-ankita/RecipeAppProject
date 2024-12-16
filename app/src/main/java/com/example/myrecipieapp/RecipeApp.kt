package com.example.myrecipieapp

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@SuppressLint("SuspiciousIndentation")
@Composable
fun RecipeApp(navController: NavHostController){
    val recipeViewModel: MainViewModel= viewModel()
    val viewstate by recipeViewModel.categoriesState

    NavHost(navController = navController, startDestination = Screen.RecipeScreen.route){
composable(route = Screen.RecipeScreen.route){
 RecipeScreen(viewstate = viewstate, navigateToDetail = {
     //This part is responsible for passing the current screen to the detail screen .
     //It utilize the savedStateHandle , which is a component od compose navigation framework
     navController.currentBackStackEntry?.savedStateHandle?.set("cat", it)
     navController.navigate(Screen.DetailScreen.route)
 })

}

        composable(route= Screen.DetailScreen.route){
          val category = navController.previousBackStackEntry?.
          savedStateHandle?.get<Category>("cat") ?: Category("", "", "", "")
              CategoryDetailScreen(category = category)
        }
    }
}