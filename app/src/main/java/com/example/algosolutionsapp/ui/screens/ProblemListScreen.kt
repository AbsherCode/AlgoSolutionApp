package com.example.algosolutionsapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.algosolutionsapp.data.model.Difficulty
import com.example.algosolutionsapp.data.provider.ProblemProvider

@Composable
fun ProblemListScreen(onProblemClick: (String) -> Unit) {
    LazyColumn(modifier = Modifier.padding(8.dp)) {
        items(ProblemProvider.problems) { problem ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
                    .clickable { onProblemClick(problem.id) },
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = problem.title, style = MaterialTheme.typography.titleLarge)
                    Text(
                        text = problem.difficulty.name,
                        color = getDifficultyColor(problem.difficulty),
                        style = MaterialTheme.typography.bodyMedium,
                    )
                }
            }
        }
    }
}

fun getDifficultyColor(difficulty: Difficulty) = when (difficulty) {
    Difficulty.EASY -> Color(0xFF4CAF50)
    Difficulty.MEDIUM -> Color(0xFFFFC107)
    Difficulty.HARD -> Color(0xFFF44336)
}
