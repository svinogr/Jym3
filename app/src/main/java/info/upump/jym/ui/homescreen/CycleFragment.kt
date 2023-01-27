package info.upump.jym.ui.homescreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import info.upump.jym.adapters.cycle.CycleAdapter
import info.upump.jym.databinding.FragmentCycleBinding
import info.upump.jym.util.Constants

class CycleFragment : Fragment() {
    private lateinit var binding: FragmentCycleBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var viemodel: CycleVM
    private lateinit var adapter: CycleAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCycleBinding.inflate(inflater, container, false)
        settingsAdapter()
        settingsRecyclerView()
        setViewModel()
        viemodel.getAll()

        return binding.root
    }

    private fun settingsAdapter() {


    }
/*
    companion object {

        fun newInstance(param1: String, param2: String) =
            CycleFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }*/

    private fun settingsRecyclerView() {
        recyclerView = binding.cycleFragmentRv
        val lm = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = lm
        adapter = CycleAdapter(listOf(), Constants.LOADER_BY_DEFAULT_TYPE)
        recyclerView.adapter = adapter
    }

    private fun setViewModel() {
        viemodel = ViewModelProvider(this)[CycleVM::class.java]
        viemodel.cycles.observe(viewLifecycleOwner) { it ->
            adapter.list = it
            println("notifyjjjjjjjjjjjjjjjjjjjjjj")
            adapter.notifyDataSetChanged()
        }
    }

}