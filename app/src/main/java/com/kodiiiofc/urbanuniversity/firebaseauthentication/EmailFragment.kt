package com.kodiiiofc.urbanuniversity.firebaseauthentication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.kodiiiofc.urbanuniversity.firebaseauthentication.databinding.FragmentEmailBinding

class EmailFragment : Fragment() {

    private var _binding: FragmentEmailBinding? = null
    private val binding get() = _binding!!
    private lateinit var parent: AppCompatActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEmailBinding.inflate(inflater, container, false)
        parent = activity as AppCompatActivity
        val adapter = EmailAdapter(requireContext())
        adapter.updateList(Email.emailList)
        binding.recycleView.adapter = adapter

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        parent.setSupportActionBar(binding.toolbar)

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}