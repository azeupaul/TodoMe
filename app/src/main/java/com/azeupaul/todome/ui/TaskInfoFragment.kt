package com.azeupaul.todome.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.azeupaul.todome.R
import com.azeupaul.todome.viewmodels.TaskInfoViewModel

class TaskInfoFragment : Fragment() {

    companion object {
        fun newInstance() = TaskInfoFragment()
    }

    private lateinit var viewModel: TaskInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.task_info_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TaskInfoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}