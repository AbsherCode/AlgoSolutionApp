package com.example.algosolutionsapp.ui.solutions

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TwoSumSolution() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Two Sum Visualizer Placeholder", style = MaterialTheme.typography.titleMedium)
        Text("Time Complexity: O(n)", color = Color.Gray, modifier = Modifier.padding(top = 8.dp))
        Text("Space Complexity: O(n)", color = Color.Gray)
    }
}