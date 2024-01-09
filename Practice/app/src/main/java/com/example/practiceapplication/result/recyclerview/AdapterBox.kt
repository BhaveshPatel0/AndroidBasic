package com.example.practiceapplication.result.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceapplication.R

class AdapterBox(val reqContext:Context,val listOfBOx:ArrayList<Int>):RecyclerView.Adapter<AdapterBox.HolderBox>() {

    val listOfSelectBox= arrayListOf<Int>()
    class HolderBox(itemView:View):RecyclerView.ViewHolder(itemView){
        val crdBox:CardView=itemView.findViewById(R.id.crdBox)
        val tvNumber:TextView=itemView.findViewById(R.id.tvNumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderBox {
        return HolderBox(LayoutInflater.from(reqContext).inflate(R.layout.item_rcv_box,parent,false))
    }

    override fun getItemCount(): Int {
        return listOfBOx.size
    }

    override fun onBindViewHolder(holder: HolderBox, position: Int) {

        if (listOfBOx.contains(position)){
            holder.crdBox.setCardBackgroundColor(reqContext.getColor(R.color.blue))
        }else{
            holder.crdBox.setCardBackgroundColor(reqContext.getColor(R.color.black))
        }

    }
}