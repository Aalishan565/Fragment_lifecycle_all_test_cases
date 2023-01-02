package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment

class FragmentA : Fragment(), View.OnClickListener {

    companion object {
        @JvmStatic
        fun newInstance() = FragmentA()
    }

    private var mBtnClick: Button? = null
    var TAG = "TAG"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach() Fragment_A")
    }

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate() Fragment_A")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView() Fragment_A")
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mBtnClick = requireActivity().findViewById<View>(R.id.btn_click) as Button
        mBtnClick!!.setOnClickListener(this)
        Log.d(TAG, "onActivityCreated() Fragment_A")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() Fragment_A")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() Fragment_A")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() Fragment_A")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() Fragment_A")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView() Fragment_A")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() Fragment_A")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach() Fragment_A")
    }

    override fun onClick(v: View?) {
        (activity as MainActivity?)!!.fragmentB()
    }

}