package com.example.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.fragmentdemo.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var navCon: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        var name = binding.inputLayoutOne.editText?.text.toString()
//        var track = binding.inputLayoutTwo.editText?.text.toString()
//        var goals = binding.inputLayoutThree.editText?.text.toString()

//        binding.submit.setOnClickListener {
//
//            val bundle = Bundle()
//            bundle.putString("name", name)
//            bundle.putString("track", track)
//            bundle.putString("goals", goals)
//            navCon.navigate(R.id.action_homeFragment_to_submissionFragment, bundle)
//
//
//        }
    }

}