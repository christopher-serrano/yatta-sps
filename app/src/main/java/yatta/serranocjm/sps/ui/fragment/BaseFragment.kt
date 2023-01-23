package yatta.serranocjm.sps.ui.fragment

import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {
    open fun initValues() {}
    open fun observeViewModel() {}
    open fun loadData() {}
    open fun setUpDynamicAdapter() {}
    open fun setOnBackPressedCallback() {}
}
