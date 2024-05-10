package com.example.appviagem

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnAddTrip).setOnClickListener {
            startActivity(Intent(activity, AddViagemActivity::class.java))
        }

        view.findViewById<Button>(R.id.btnViewTripDetails).setOnClickListener {
            startActivity(Intent(activity, DetalheViagemActivity::class.java))
        }
    }
}