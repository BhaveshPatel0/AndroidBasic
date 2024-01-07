package com.example.practiceapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.practiceapplication.databinding.ActivityMainBinding
import com.example.practiceapplication.result.recyclerview.BoxAct

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var output = ""
    var count = 0
    var whileCounter = 0

    var alphaCounter=0


    val listOfAlphabet= arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listOfAlphabet.add("A")
        listOfAlphabet.add("B")
        listOfAlphabet.add(" C")
        listOfAlphabet.add("D")
        listOfAlphabet.add(" E")
        listOfAlphabet.add(" F")
        listOfAlphabet.add("G")
        listOfAlphabet.add(" H")
        listOfAlphabet.add(" I")
        listOfAlphabet.add(" J")
        listOfAlphabet.add("K")
        listOfAlphabet.add(" L")
        listOfAlphabet.add(" M")
        listOfAlphabet.add(" N")
        listOfAlphabet.add(" O")
//?
//        5
//5 5 5 5 5
//5 5 5 5 5
//5 5 5 5 5
//5 5 5 5 5
//5 5 5 5 5

//        listOfAlphabet.get(alphaCounter)
        output=output.plus("\n")
        for (row in 0..5){

            for (column in 0..row){
                output=output.plus("*")
                alphaCounter++
            }

            output=output.plus("\n")

            Log.d("TAG1", "onCreate:$output ")

        }

//        while (listOfAlphabet[alphaCounter]<alphaCounter.toString()){

//        }







        bindClick()

    }

    private fun bindClick() {
        binding.btnPractice.setOnClickListener {

            startActivity(Intent(this,BoxAct::class.java))

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



        object KboatStringPattern {
            @JvmStatic
            fun main(args: Array<String>) {
                var ch = 'A'
                for (i in 0..4) {
                    for (j in 0..i) {
                        print(ch++)
                    }
                    println()
                }
            }
        }



}
