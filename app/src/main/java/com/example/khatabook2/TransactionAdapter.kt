package com.example.khatabook2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.khatabook2.Database.Database

class TransactionAdapter(list: ArrayList<TransactionModel>) :
    RecyclerView.Adapter<TransactionAdapter.TransactionHolder>() {

    var list=list
    lateinit var  context: Context
    lateinit var Database:Database


    class TransactionHolder (itemView:View):ViewHolder(itemView){

        var income=itemView.findViewById<TextView>(R.id.income)
        var expense=itemView.findViewById<TextView>(R.id.income)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionHolder{
        context=parent.context
        return  TransactionHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_main,parent,false))

    }

    override fun getItemCount(): Int {
      return  list.size
    }

    override fun onBindViewHolder(holder: TransactionAdapter.TransactionHolder, position: Int) {

        holder.expense.text= list.get(position).number.toString().toInt().toString()
    }


}