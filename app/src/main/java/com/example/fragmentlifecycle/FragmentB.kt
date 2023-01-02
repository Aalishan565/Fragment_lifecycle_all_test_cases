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

class FragmentB : Fragment(), View.OnClickListener {

    companion object {
        @JvmStatic
        fun newInstance() = FragmentB()
    }

    private var mBtnClick: Button? = null
    var TAG = "TAG"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach() Fragment_B")
    }

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate() Fragment_B")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView() Fragment_B")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mBtnClick = requireActivity().findViewById<View>(R.id.btn) as Button
        mBtnClick!!.setOnClickListener(this)
        Log.d(TAG, "onActivityCreated() Fragment_B")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() Fragment_B")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() Fragment_B")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() Fragment_B")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() Fragment_B")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView() Fragment_B")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() Fragment_B")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach() Fragment_B")
    }

    override fun onClick(v: View?) {
        (activity as MainActivity?)!!.fragmentC()
    }

}