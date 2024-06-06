package com.example.sample.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.findFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sample.R
import com.example.sample.adapter.CustomAdapter
import com.example.sample.data.ItemData

class RecyclerViewFragment : Fragment() {

    private lateinit var adapter: CustomAdapter
    private lateinit var recyclerViewFragment: RecyclerViewFragment
    private lateinit var newsArrayList: ArrayList<ItemData>
    private lateinit var imageId : Array<Int>
    private lateinit var heading : Array<String>
    private lateinit var news : Array<String>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerViewFragment = View.findViewById(R.id.recycler_view)
        recyclerViewFragment.layoutManager = layoutManager
        recyclerViewFragment.setHasFixedSize(true)
        adapter = CustomAdapter(newsArrayList)
        recyclerViewFragment.adapter = adapter

    }

        private fun dataInitialize(){
        newsArrayList = arrayListOf<ItemData>()
        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
        )
        heading = arrayOf(
            getString(R.string.head_1),
            getString(R.string.head_2),
            getString(R.string.head_3),
            getString(R.string.head_4),
            getString(R.string.head_5),
            getString(R.string.head_6),
            getString(R.string.head_7),
            getString(R.string.head_8),
            getString(R.string.head_9),
            getString(R.string.head_10)
        )
        news = arrayOf(
            getString(R.string.news_a),
            getString(R.string.news_b),
            getString(R.string.news_c),
            getString(R.string.news_d),
            getString(R.string.news_e),
            getString(R.string.news_f),
            getString(R.string.news_g),
            getString(R.string.news_h),
            getString(R.string.news_i),
            getString(R.string.news_j)
        )
        for (i in imageId.indices){
            val news = ItemData(imageId[i], heading[i])
            newsArrayList.add(news)
        }
    }
}