package com.example.medalcasecoding.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.medalcasecoding.data.model.DataModel
import com.example.medalcasecoding.data.network.Repositories
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor( private val repository: Repositories) : ViewModel() {


    init {
        getData()
    }

    private val _infoDataLivaData: MutableLiveData<List<DataModel>> = MutableLiveData()
    val infoDataLivaData: LiveData<List<DataModel>> = _infoDataLivaData

    private fun getData() {
        viewModelScope.launch {
            val responseDataWrapper = repository.getData()
            _infoDataLivaData.postValue(responseDataWrapper)
        }
    }

}