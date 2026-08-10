package com.example.algosolutionsapp.data.provider

import com.example.algosolutionsapp.data.model.AlgoProblem
import com.example.algosolutionsapp.data.model.Difficulty

object ProblemProvider {
    val problems = listOf(
        AlgoProblem(
            id = "two_sum",
            title = "Two Sum",
            difficulty = Difficulty.EASY,
            description = "Find two numbers that add up to a specific target."
        ),
        AlgoProblem(
            id = "reverse_string",
            title = "Reverse String",
            difficulty = Difficulty.EASY,
            description = "Reverse an array of characters in-place."
        )
    )
}