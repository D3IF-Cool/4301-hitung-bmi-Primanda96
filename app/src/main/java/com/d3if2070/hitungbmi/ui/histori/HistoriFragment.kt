package com.d3if2070.hitungbmi.ui.histori

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.d3if2070.hitungbmi.databinding.FragmentHitungBinding


class HistoriFragment : Fragment() {
    private lateinit var binding: FragmentHitungBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentHitungBinding.inflate(layoutInflater,
                container, false)
        return binding.root
    }
}