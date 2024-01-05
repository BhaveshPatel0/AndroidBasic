package com.example.practiceapplication.result

import java.io.Serializable

data class StudentDetail(
    val name: String,
    val englishMarks: Int,
    val mathsMarks: Int,
    val scienceMarks: Int

):Serializable
