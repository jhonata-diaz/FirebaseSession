package com.example.myapplication.presentation.AppNavigation


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.myapplication.presentation.screens.login.LoginScreen


@Composable
fun AppNavigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = AppScreen.Login.route
    ) {

        composable(route = AppScreen.Login.route) {
           LoginScreen(navController)
            //Text("hola mundo app")
        }

        composable(route = AppScreen.Signup.route) {
          //  SignupScreen(navController)
        }

        composable(route = AppScreen.Profile.route) {
           // ProfileScreen(navController)


        }



    }

}