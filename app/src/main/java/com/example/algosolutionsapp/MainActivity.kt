package com.example.algosolutionsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.algosolutionsapp.ui.screens.HomeScreen
import com.example.algosolutionsapp.ui.screens.ProblemListScreen
import com.example.algosolutionsapp.ui.screens.SolutionScreen
import com.example.algosolutionsapp.ui.theme.AlgoSolutionsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AlgoSolutionsAppTheme {
                AlgoApp()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello my friend, $name!",
        modifier = modifier,
    )
}

@Composable
fun AlgoApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        // Home handles both selection types within internal layout sub-tabs
        composable("home") {
            HomeScreen(
                onAlgoClick = { problemId ->
                    navController.navigate("detail/$problemId")
                },
                onComponentClick = { componentId ->
                    navController.navigate("detail/$componentId")
                }
            )
        }
        // Universal detail route structure
        composable(
            route = "detail/{itemId}",
            arguments = listOf(navArgument("itemId") { type = NavType.StringType })
        ) { backStackEntry ->
            val itemId = backStackEntry.arguments?.getString("itemId") ?: ""
            SolutionScreen(
                problemId = itemId,
                onBack = { navController.popBackStack() }
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AlgoSolutionsAppTheme {
        Greeting("Android")
    }
}