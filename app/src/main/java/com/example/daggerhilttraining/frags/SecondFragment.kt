package com.example.daggerhilttraining.frags

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.daggerhilttraining.R
import com.example.daggerhilttraining.ThirdPartyClass
import com.example.daggerhilttraining.WiFiManager
import com.example.daggerhilttraining.databinding.FragmentSecondBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    @Inject
    lateinit var wiFiManager: WiFiManager

    @Inject
    lateinit var thirdPartyClass: ThirdPartyClass

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }

        Log.d("MyLog", "SecondFragment instance id: $wiFiManager")
        Log.d("MyLog", "SecondFragment ThirdPartyClass id: $thirdPartyClass")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}