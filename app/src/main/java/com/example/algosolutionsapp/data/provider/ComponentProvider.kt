package com.example.algosolutionsapp.data.provider

import com.example.algosolutionsapp.data.model.ComponentExample

object ComponentProvider {
    val components = listOf(
        ComponentExample(
            id = "custom_button",
            name = "Interactive Buttons",
            category = "Inputs",
            description = "Examples of Filled, Outlined, Elevate, and Text buttons with click states."
        ),
        ComponentExample(
            id = "custom_card",
            name = "Complex Cards",
            category = "Surfaces",
            description = "Elevated and outlined card configurations showcasing image layouts."
        )
    )
}