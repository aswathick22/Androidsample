package com.example.sample.retrofit

data class Wizard(
    val elixirs: List<WizardElixir>?,
    val id: String,
    val firstName: String?,
    val lastName:String?
)

data class WizardElixir(
    val id: String,
    val name:String?
)
