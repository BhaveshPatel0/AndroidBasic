package com.example.practiceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.practiceapplication.databinding.ActivityMainBinding
import com.example.practiceapplication.result.ResultAct

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var output = ""
    var count = 0
    var whileCounter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindClick()

    }

    private fun bindClick() {
        binding.btnPractice.setOnClickListener {


        }
        binding.btnLoop.setOnClickListener {


            val number = binding.edtNumber.text.toString().toInt()


            binding.tvLoop.text = nestedWhileLoop(number)

        }
    }

    fun patternDownForLoop(number: Int, star: String? = null): String {


        for (column in 1..number) {

            for (row in number downTo column) {
                if (star == null) {
                    output = output.plus(column)
                } else {
                    output = output.plus(star)
                }

//                Log.d("TAG", "patternForLoop: $column")

            }
            output = output.plus("\n")
        }

        return output
    }

    fun patternForLoop(number: Int, star: String? = null): String {


        for (column in 1..number) {

            for (row in 1..column) {
                if (star == null) {
                    output = output.plus(column)
                } else {
                    output = output.plus(star)
                }

//                Log.d("TAG", "patternForLoop: $column")

            }
            output = output.plus("\n")
        }

        return output
    }


    fun patternWhileLoop(number: Int): String {


        while (number > count) {


            count++

            output=output.plus(count).plus("\n")
        }
        return output
    }


    //11111
    //1111
    //111
    //11
    //1
    fun nestedWhileLoop(number: Int): String {

        //row
        while (count < number) {
            //0,1
            count++
            //1,2
            //column
            while (whileCounter < number) {

                output = output.plus(whileCounter)
                whileCounter++
            }

            whileCounter=count
            if (count==number){
                output=output
            }
            else{
                output = output.plus("\n")
            }


        }

        return output
    }

    fun doWhileLoop(number: Int):String{
//        do {
//
//        }
//            while (number>whileCounter){

//        }
        return output
    }
}
