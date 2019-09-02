package buu.informatics.s59160090.loginparking


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160090.loginparking.databinding.FragmentInfoBinding
import buu.informatics.s59160090.loginparking.databinding.FragmentLoginBinding

/**
 * A simple [Fragment] subclass.
 */
class InfoFragment : Fragment() {
    private lateinit var binding: FragmentInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentInfoBinding>(inflater,
            R.layout.fragment_info,container,false)
        return binding.root
    }
}
