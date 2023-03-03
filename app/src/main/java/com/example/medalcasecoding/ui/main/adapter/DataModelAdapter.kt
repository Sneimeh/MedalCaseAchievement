package com.example.medalcasecoding.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.medalcasecoding.databinding.RowTitleBinding
import com.example.medalcasecoding.data.model.DataModel

class DataModelAdapter(private val DataModelList: List<com.example.medalcasecoding.data.model.DataModel>) :
    RecyclerView.Adapter<DataModelAdapter.DataModelViewHolder>() {

    private lateinit var layoutInflater: LayoutInflater

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        layoutInflater = LayoutInflater.from(recyclerView.context)
    }

    inner class DataModelViewHolder(private val binding: RowTitleBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(dataModel: com.example.medalcasecoding.data.model.DataModel) {
            binding.data = dataModel
            binding.recyclerViewRecord.adapter = RecordModelAdapter(dataModel.recordModels)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataModelViewHolder {
        return DataModelViewHolder(RowTitleBinding.inflate(layoutInflater, parent, false))
    }

    override fun getItemCount() = DataModelList.size

    override fun onBindViewHolder(holder: DataModelViewHolder, position: Int) {
        val currentModel = DataModelList[position]
        holder.bind(currentModel)
    }


}