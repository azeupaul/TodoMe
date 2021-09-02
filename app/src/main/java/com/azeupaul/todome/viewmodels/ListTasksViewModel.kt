package com.azeupaul.todome.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListTasksViewModel : ViewModel() {

    private val _navigateToTaskDetail = MutableLiveData<Boolean?>()
    val navigateToTaskDetail: LiveData<Boolean?>
        get() = _navigateToTaskDetail

    fun doneNagivatingToDetail() {
        _navigateToTaskDetail.value = null
    }

    fun onShow() {
        _navigateToTaskDetail.value = true
    }
}