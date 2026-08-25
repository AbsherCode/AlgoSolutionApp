package com.example.algosolutionsapp.ui.component_samples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonExample() {
    val sourceCode = """
        @Composable
        fun ButtonExample() {
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                    Text("Filled Button (Primary Action)")
                }
                
                OutlinedButton(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                    Text("Outlined Button (Secondary Action)")
                }
                
                ElevatedButton(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                    Text("Elevated Button")
                }
            }
        }
    """.trimIndent()

    CodePreviewWrapper(codeString = sourceCode) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                Text("Filled Button (Primary Action)")
            }
            OutlinedButton(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                Text("Outlined Button (Secondary Action)")
            }
            ElevatedButton(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                Text("Elevated Button")
            }
        }
    }
}
