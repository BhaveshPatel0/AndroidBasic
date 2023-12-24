package com.example.practiceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.practiceapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindClick()

    }

    private fun bindClick() {
        binding.btnLoop.setOnClickListener {


            val number=binding.edtNumber.text.toString().toInt()

            var output=""
            var count=0

            var whileCounter=1

            //Do While Loop

            do {
                whileCounter+=0
                Log.d("TAG", "bindClick: $whileCounter")
            }while (number<whileCounter)


            //While Loop
//            while (number>whileCounter){
//                whileCounter+=1
//                output=output.plus("\n")
//                while (whileCounter>count){
//                    count+=1
//                    output=output.plus(whileCounter)
//                }
//                count=0
//                Log.d("TAG", "bindClick: $whileCounter")
//            }
//            binding.tvLoop.text=output.toString()
//

            //For Loop
//            for (num in 1..number){
//                output=output.plus("\n")
//                for (row in 1..num){
//                    count += 1
//                    output=output.plus(count)
//                }
//
//            }



        }
    }
}