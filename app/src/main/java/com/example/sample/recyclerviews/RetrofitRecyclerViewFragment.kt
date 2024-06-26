package com.example.sample.recyclerviews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sample.R
import com.example.sample.adapter.RetrofitAdapter
import com.example.sample.retrofit.MyViewModel

class RetrofitRecyclerViewFragment : Fragment() {

    private val mainViewModel by viewModels<MyViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.retrofit_recyclerview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.retrofit_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(context)

        mainViewModel.harryPotterData.observe(viewLifecycleOwner){ items ->
            recyclerView.adapter = RetrofitAdapter(items)
        }
    }

}