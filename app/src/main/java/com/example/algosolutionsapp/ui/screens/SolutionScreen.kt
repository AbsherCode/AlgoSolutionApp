package com.example.algosolutionsapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.algosolutionsapp.data.provider.ComponentProvider
import com.example.algosolutionsapp.data.provider.ProblemProvider
import com.example.algosolutionsapp.ui.solutions.ReverseStringSolution
import com.example.algosolutionsapp.ui.solutions.TwoSumSolution
import com.example.algosolutionsapp.ui.component_samples.ButtonExample
import com.example.algosolutionsapp.ui.component_samples.CardExample

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SolutionScreen(problemId: String, onBack: () -> Unit) {
//    val problem = ProblemProvider.problems.find { it.id == problemId }
    val algoTitle = ProblemProvider.problems.find { it.id == problemId }?.title
    val compTitle = ComponentProvider.components.find { it.id == problemId }?.name

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(algoTitle ?: compTitle ?: "Detail View") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        // Replace the internal when layout logic in SolutionScreen.kt with this:
        Column(modifier = Modifier.padding(paddingValues)) {
            // Attempt to locate a match in either problems list or components list


            when (problemId) {
                // Algorithm Mappings
                "two_sum" -> TwoSumSolution()
                "reverse_string" -> ReverseStringSolution()

                // Component Mappings
                "custom_button" -> ButtonExample()
                "custom_card" -> CardExample()

                else -> Text("Example canvas not configured.")
            }
        }

    }
}
