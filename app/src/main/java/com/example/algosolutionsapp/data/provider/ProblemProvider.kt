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
        ),
        AlgoProblem(
            id = "fizz_buzz",
            title = "Fizz Buzz",
            difficulty = Difficulty.EASY,
            description = "Print numbers from 1 to n, replacing multiples of 3 with \"Fizz\", 5 with \"Buzz\", and both with \"FizzBuzz\"."
        ),
        AlgoProblem(
            id = "palindrome_number",
            title = "Palindrome Number",
            difficulty = Difficulty.EASY,
            description = "Check if an integer reads the same backward as forward."
        ),
        AlgoProblem(
            id = "merge_two_sorted_lists",
            title = "Merge Two Sorted Lists",
            difficulty = Difficulty.EASY,
            description = "Combine two sorted linked lists into one single sorted list."
        ),
        AlgoProblem(
            id = "roman_to_integer",
            title = "Roman to Integer",
            difficulty = Difficulty.EASY,
            description = "Convert a Roman numeral into an integer value."
        ),
        AlgoProblem(
            id = "valid_parentheses",
            title = "Valid Parentheses",
            difficulty = Difficulty.EASY,
            description = "Determine if an input string of brackets is valid and properly closed."
        ),
    )
}