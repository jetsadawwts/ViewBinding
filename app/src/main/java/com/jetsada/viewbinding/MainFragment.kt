package com.jetsada.viewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jetsada.viewbinding.databinding.FragmentMainBinding


class MainFragment : Fragment() {
     private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding.tvHelloWorld.text = "Hello World Fragment"
    }

}