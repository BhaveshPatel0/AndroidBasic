package com.example.practiceapplication.result

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceapplication.R
import com.example.practiceapplication.databinding.ActivityDisplayResultBinding

class DisplayResultAct : AppCompatActivity() {
    private lateinit var binding: ActivityDisplayResultBinding
    private lateinit var studentDetail: StudentDetail
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDisplayResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindClick()

        intent.extras?.let {
            studentDetail = it.get("StudentDetail") as StudentDetail
        }



    }

    private fun bindClick() {


    }
}