package com.example.painttracker.ui.paint

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.painttracker.R
import com.example.painttracker.ui.paint.viewmodel.paintViewModel

class paintFragment : Fragment() {
    private val viewModel: paintViewModel by activityViewModels {
        paintViewModel.Factory
    }

    private lateinit var binding: FragmentPaintBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPaintBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewModel()
    }

    private fun setViewModel() {
        binding.viewmodel = viewModel
    }

}