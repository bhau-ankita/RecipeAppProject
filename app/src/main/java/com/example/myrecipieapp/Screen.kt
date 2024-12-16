package com.example.myrecipieapp

sealed class Screen(val route: String) {
object  RecipeScreen: Screen("recipescreen")
    object DetailScreen: Screen("detailscreen")
}