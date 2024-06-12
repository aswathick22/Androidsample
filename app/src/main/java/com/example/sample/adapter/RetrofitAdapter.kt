package com.example.sample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sample.R
import com.example.sample.adapter.RetrofitAdapter.*
import com.example.sample.data.Wizard

class RetrofitAdapter(private val mList: List<Wizard>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_of_wizards, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemsViewModel = mList[position]
        holder.textView1.text = itemsViewModel.id
        holder.textView2.text = itemsViewModel.firstName
        holder.textView3.text = itemsViewModel.lastName
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val textView1 : TextView = itemView.findViewById(R.id.text_wizard_id)
        val textView2 : TextView = itemView.findViewById(R.id.text_wizard_firstName)
        val textView3 : TextView = itemView.findViewById(R.id.text_wizard_lastName)
    }

}