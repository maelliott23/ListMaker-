package com.apps.listmaker

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class ListSelectionRecyclerViewAdapter : RecyclerView.Adapter<ListSelectionViewHolder>(){

    val listTitle = arrayOf("Grocery", "To Do", "Android Requirements")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        //this creates the view
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_selection_view_holder, parent, false)
        //returns the view
        return ListSelectionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTitle.size//To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        if (holder != null){
            holder.listPosition.text = (position + 1).toString()
            holder.listTitle.text = listTitle[position]
        }




    }

}
