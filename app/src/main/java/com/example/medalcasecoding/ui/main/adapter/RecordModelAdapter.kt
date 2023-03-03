package com.example.medalcasecoding.ui.main.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.medalcasecoding.databinding.RowRecordBinding
import com.example.medalcasecoding.data.model.RecordModel

class RecordModelAdapter(private val recordModelList: List<com.example.medalcasecoding.data.model.RecordModel>) :
    RecyclerView.Adapter<RecordModelAdapter.RecordViewHolder>() {

    private lateinit var layoutInflater: LayoutInflater

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        layoutInflater = LayoutInflater.from(recyclerView.context)
        Log.d("tag00", "inside adapter")

    }

    inner class RecordViewHolder(private val binding: RowRecordBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: com.example.medalcasecoding.data.model.RecordModel) {
            binding.recordModel = model
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordViewHolder {
        return RecordViewHolder(RowRecordBinding.inflate(layoutInflater, parent, false))
    }

    override fun getItemCount() = recordModelList.size

    override fun onBindViewHolder(holder: RecordViewHolder, position: Int) {
        val currentModel = recordModelList[position]
        holder.bind(currentModel)
    }


}