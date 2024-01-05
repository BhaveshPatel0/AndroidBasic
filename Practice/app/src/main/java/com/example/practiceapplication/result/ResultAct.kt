package com.example.practiceapplication.result

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.practiceapplication.R
import com.example.practiceapplication.databinding.ActivityMainBinding
import com.example.practiceapplication.databinding.ActivityResultBinding


class ResultAct : AppCompatActivity() {
    private lateinit var binding:ActivityResultBinding
    private lateinit var mAdapterStudentName: AdapterStudentName

    val listOfStudentName= arrayListOf<StudentDetail>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAdapterStudentName= AdapterStudentName(this,listOfStudentName)
        bindClick()
    }

    private fun bindClick() {

        binding.btnAdd.setOnClickListener {

            val name=binding.edtStudentName.text.toString()
            val english=binding.edtEnglish.text.toString().toInt()
            val maths=binding.edtMaths.text.toString().toInt()
            val science=binding.edtScience.text.toString().toInt()

            listOfStudentName.add(StudentDetail(name,english,maths,science))

            binding.rcvStudentName.apply {

                layoutManager=GridLayoutManager(this@ResultAct,1)
                adapter=mAdapterStudentName
            }


        }
    }
}