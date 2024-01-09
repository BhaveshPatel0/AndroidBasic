package com.example.practiceapplication.result.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.practiceapplication.R
import com.example.practiceapplication.databinding.ActivityBoxBinding

class BoxAct : AppCompatActivity() {
    private lateinit var binding: ActivityBoxBinding
    private lateinit var mAdapterBox: AdapterBox

    var rowCounter = 0
    var columnCounter = 0
    val listOfBOx = arrayListOf<Int>()
    val listOfSelectedBox = arrayListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBoxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAdapterBox = AdapterBox(this, listOfBOx)

        bindClick()
    }

    private fun bindClick() {
        binding.btnBox.setOnClickListener {

            val box = binding.edtBoxSize.text.toString().toInt()

            for (row in 1..box) {
                for (column in 1..row) {

                    rowCounter++
                    listOfBOx.add(rowCounter)

                }
                rowCounter=rowCounter+box
                columnCounter=rowCounter
                columnCounter=listOfBOx.add(rowCounter)

            }
            Log.d("TAG_XYZ", "bidClick: $listOfBOx")
            Log.d("TAG_XYZ", "bidClick: ${listOfBOx.size}")

            binding.rcvBox.apply {

                layoutManager = GridLayoutManager(this@BoxAct, box)
                adapter = mAdapterBox

            }
        }
    }

    fun selectBox(box: Int): Int {

        for (row in 1..box) {
            for (column in 1..row) {
                selectBox=selectBox+1
            }
            selectBox=selectBox+3
        }
        return selectBox
    }
}