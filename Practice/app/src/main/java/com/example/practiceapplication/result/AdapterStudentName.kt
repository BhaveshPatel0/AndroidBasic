package com.example.practiceapplication.result

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceapplication.R

class AdapterStudentName(val reqContext: Context, val listOfName: List<StudentDetail>) :
    RecyclerView.Adapter<AdapterStudentName.HolderStudentName>() {

    class HolderStudentName(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvStudentName: TextView =itemView.findViewById(R.id.tvStudentName)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderStudentName {
        return HolderStudentName(
            LayoutInflater.from(reqContext).inflate(R.layout.item_rcv_name, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listOfName.size
    }

    override fun onBindViewHolder(holder: HolderStudentName, position: Int) {

        holder.tvStudentName.text=listOfName[position].name
        holder.tvStudentName.setOnClickListener {

            reqContext.startActivity(Intent(reqContext,DisplayResultAct::class.java).putExtra("studentDataClass",listOfName[position]))
        }
    }
}