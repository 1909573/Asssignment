package com.example.asssignment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.fragment_home.*
import androidx.fragment.app.FragmentActivity




/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment(){
    lateinit var libraryFragment: LibraryFragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button2.setOnClickListener {
            test()

        }


    }



    private fun test(){
        libraryFragment=LibraryFragment()

        getFragmentManager()!!
            .beginTransaction()
            .replace(R.id.container1,libraryFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
    }






}
