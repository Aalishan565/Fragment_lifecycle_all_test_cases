package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment

class FragmentC : Fragment() {

    var TAG = "TAG"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach() Fragment_C")
    }

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate() Fragment_C")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView() Fragment_C")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "onActivityCreated() Fragment_C")
        requireView().isFocusableInTouchMode = true
        requireView().requestFocus()
        requireView().setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                Log.d("Tag", "onKey: ")
                //  getFragmentManager().popBackStack();
                requireFragmentManager().popBackStack("Fragment_A", 0)
                return@OnKeyListener true
            }
            false
        })
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() Fragment_C")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() Fragment_C")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() Fragment_C")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() Fragment_C")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView() Fragment_C")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() Fragment_C")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach() Fragment_C")
    }

    companion object {
        @JvmStatic
        fun newInstance() = FragmentC()
    }

}