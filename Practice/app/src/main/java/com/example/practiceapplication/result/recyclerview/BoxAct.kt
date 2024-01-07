package com.example.practiceapplication.result.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.practiceapplication.R
import com.example.practiceapplication.databinding.ActivityBoxBinding

class BoxAct : AppCompatActivity() {
    private lateinit var binding:ActivityBoxBinding
    private lateinit var mAdapterBox: AdapterBox

    val listOfBOx= arrayListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBoxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAdapterBox= AdapterBox(this,listOfBOx)

        bindClick()
    }

    private fun bindClick() {
        binding.btnBox.setOnClickListener {

            val box=binding.edtBoxSize.text.toString().toInt()

            for (row in 1..box*box){
//                for (column in 1..box){
                    listOfBOx.add(row)
//                }
            }
            Log.d("TAG_XYZ", "bidClick: $listOfBOx")
            Log.d("TAG_XYZ", "bidClick: ${listOfBOx.size}")

            binding.rcvBox.apply {

                layoutManager=GridLayoutManager(this@BoxAct,box)
                adapter=mAdapterBox

            }
        }
    }
}