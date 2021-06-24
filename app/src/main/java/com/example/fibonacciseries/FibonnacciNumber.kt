package com.example.fibonacciseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class FibonnacciNumber (var numberList: List<BigInteger>):RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView= LayoutInflater.from(parent.context).inflate(R.layout.name_list_item,parent,false)
        return NumbersViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.number.text=numberList.get(position).toString()

    }

    override fun getItemCount(): Int {
        return numberList.size

    }
}
class NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var number=itemView.findViewById<TextView>(R.id.tvName)

}