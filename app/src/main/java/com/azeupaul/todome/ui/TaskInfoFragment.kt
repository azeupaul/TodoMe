package com.azeupaul.todome.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.azeupaul.todome.R
import com.azeupaul.todome.databinding.TaskInfoFragmentBinding
import com.azeupaul.todome.viewmodels.TaskInfoViewModel

class TaskInfoFragment : Fragment() {

    private lateinit var taskInfoViewModel: TaskInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<TaskInfoFragmentBinding>(inflater, R.layout.task_info_fragment, container, false)

        taskInfoViewModel = ViewModelProvider(this).get(TaskInfoViewModel::class.java)
        binding.viewmodel = taskInfoViewModel

        return binding.root
    }

}