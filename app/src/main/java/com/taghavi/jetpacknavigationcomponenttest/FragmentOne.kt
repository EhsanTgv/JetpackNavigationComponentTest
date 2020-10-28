package com.taghavi.jetpacknavigationcomponenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_one.*

class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_one, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentOneText.setOnClickListener {
            view.findNavController().navigate(
                R.id.action_fragmentOne_to_fragmentTwo,
                null,
                NavOptions.Builder().setPopUpTo(R.id.fragmentOne, true).build()
            )
        }
    }
}