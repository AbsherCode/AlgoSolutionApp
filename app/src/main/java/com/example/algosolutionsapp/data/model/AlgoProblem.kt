package com.example.algosolutionsapp.data.model

data class AlgoProblem(
    val id: String,
    val title: String,
    val difficulty: Difficulty,
    val description: String
)

enum class Difficulty { EASY, MEDIUM, HARD }