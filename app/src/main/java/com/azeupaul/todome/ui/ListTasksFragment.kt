package com.azeupaul.todome.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.azeupaul.todome.R
import com.azeupaul.todome.databinding.ListTasksFragmentBinding
import com.azeupaul.todome.viewmodels.ListTasksViewModel


class ListTasksFragment : Fragment() {

    companion object {
        fun newInstance() = ListTasksFragment()
    }

    private lateinit var listTasksViewModel: ListTasksViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<ListTasksFragmentBinding>(inflater, R.layout.list_tasks_fragment, container, false)

        listTasksViewModel = ViewModelProvider(this).get(ListTasksViewModel::class.java)
        binding.viewmodel = listTasksViewModel

        listTasksViewModel.navigateToTaskDetail.observe(viewLifecycleOwner, Observer { navigation ->
            if (navigation == true){
                this.findNavController().navigate(ListTasksFragmentDirections.actionListTasksFragmentToTaskInfoFragment())
                listTasksViewModel.doneNagivatingToDetail()
            }
        })

        return binding.root
    }

}