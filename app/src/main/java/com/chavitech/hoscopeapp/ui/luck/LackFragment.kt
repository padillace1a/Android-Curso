package com.chavitech.hoscopeapp.ui.luck

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chavitech.hoscopeapp.databinding.FragmentLackBinding

class LackFragment : Fragment() {

    private var _binding: FragmentLackBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLackBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}