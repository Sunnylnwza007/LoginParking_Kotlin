package buu.informatics.s59160090.loginparking


import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import buu.informatics.s59160090.loginparking.databinding.FragmentLoginBinding


/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater,
            R.layout.fragment_login,container,false)
        binding.login.setOnClickListener { view : View ->
            binding.apply {
                if (username.text.toString().equals("sunny") && password.text.toString().equals("1234")){
                    view.findNavController().navigate(R.id.action_loginFragment_to_parkingFragment)
                }else{
                    Toast.makeText(context,"Username or password is not match.",Toast.LENGTH_SHORT).show()
                }

            }
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }


}
