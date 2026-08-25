package com.example.algosolutionsapp.ui.component_samples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CardExample() {
    val cardCode = """
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            )
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Material 3 Surface Variant Card", style = MaterialTheme.typography.titleMedium)
                Text("This card leverages the pre-configured color palette definitions...")
            }
        }
    """.trimIndent()

    CodePreviewWrapper(codeString = cardCode) {
        Column(modifier = Modifier.padding(top = 16.dp)) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Material 3 Surface Variant Card", style = MaterialTheme.typography.titleMedium)
                    Text(
                        "This card leverages the pre-configured color palette definitions optimized for modern system dark and light modes.",
                        modifier = Modifier.padding(top = 8.dp)
                    )
                }
            }
        }
    }
}
