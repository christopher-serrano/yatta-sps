package yatta.serranocjm.sps.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import yatta.serranocjm.sps.R
import yatta.serranocjm.sps.databinding.FragmentSearchFormBinding

class SearchFormFragment : BaseFragment() {

    private var _binding: FragmentSearchFormBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_form, container, false)
    }
}
