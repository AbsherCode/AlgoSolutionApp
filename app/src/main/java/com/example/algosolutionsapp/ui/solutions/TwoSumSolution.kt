package com.example.algosolutionsapp.ui.solutions

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TwoSumSolution() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(scrollState),
    ) {
        Text("Two Sum", style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.height(8.dp))
        TwoSumDescriptionView()
        Spacer(modifier = Modifier.height(16.dp))
        SolutionCodeView()
        Spacer(modifier = Modifier.height(16.dp))
        Text("Time Complexity: O(n)", color = Color.Gray, modifier = Modifier.padding(top = 8.dp))
        Text("Space Complexity: O(n)", color = Color.Gray)
    }
}

@Composable
fun TwoSumDescriptionView(){
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "Given an array of integers nums and an integer target, " +
                    "return indices of the two numbers such that they add up to target.",
             style = MaterialTheme.typography.bodyMedium,
             lineHeight = 24.sp,
        )
        Text(text = "You may assume that each input would have exactly " +
                    "one solution, and you may not use the same element twice.",
             style = MaterialTheme.typography.bodyMedium,
             lineHeight = 24.sp,
        )
        Text("You can return the answer in any order.",
             style = MaterialTheme.typography.bodyMedium,
             lineHeight = 24.sp,
        )
        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier.padding(16.dp)) {
            Text("Example 1:", style = MaterialTheme.typography.titleMedium)
            Text("Input: nums = [2,7,11,15], target = 9",
                 style = MaterialTheme.typography.bodyMedium,
                 lineHeight = 24.sp,
            )
            Text("Output: [0,1]",
                 style = MaterialTheme.typography.bodyMedium,
                 lineHeight = 24.sp,
            )
            Text("Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].",
                 style = MaterialTheme.typography.bodyMedium,
                 lineHeight = 24.sp,
            )
        }
        Column(
            modifier = Modifier.padding(16.dp)) {
            Text("Example 2:", style = MaterialTheme.typography.titleMedium)
            Text("Input: nums = [3,2,4], target = 6",
                 style = MaterialTheme.typography.bodyMedium,
                 lineHeight = 24.sp,
            )
            Text("Output: [1,2]",
                 style = MaterialTheme.typography.bodyMedium,
                 lineHeight = 24.sp,
            )
            Text("Explanation: Because nums[1] + nums[2] == 6, we return [1, 2].",
                 style = MaterialTheme.typography.bodyMedium,
                 lineHeight = 24.sp,
            )
        }
    }
}

@Composable
fun SolutionCodeView(){
    val codeSnippet = """
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val seen = HashMap<Int, Int>()
            for (i in nums.indices) {
                val complement = target - nums[i]
                if (complement in seen) {
                    return intArrayOf(seen[complement]!!, i)
                }
                seen[nums[i]] = i
            }
            return intArrayOf()
        }
    """.trimIndent()
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "Time Complexity: O(n) | Space Complexity: O(n)",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(12.dp))

        // Code Block
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF2D2D2D), RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Text(
                text = codeSnippet,
                color = Color(0xFFF8F8F2),
                fontFamily = FontFamily.Monospace,
                fontSize = 13.sp,
                lineHeight = 20.sp,
            )
        }
    }

}