package com.apps.listmaker

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ListSelectionViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    // added textView reference to the viewholder
    val listPosition = itemView.findViewById<TextView>(R.id.itemNumber)as TextView  //cast the item as a text view
    val listTitle = itemView.findViewById<TextView>(R.id.itemString)as TextView




}