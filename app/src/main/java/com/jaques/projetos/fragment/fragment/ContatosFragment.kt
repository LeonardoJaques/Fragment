package com.jaques.projetos.fragment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.TextView

import com.jaques.projetos.fragment.R
import kotlinx.android.synthetic.main.fragment_contatos.*

/**
 * A simple [Fragment] subclass.
 */
class ContatosFragment : Fragment() {

    private lateinit var textViewContato: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contatos, container, false)

        textViewContato = view.findViewById(R.id.textView_contato)
        textViewContato.text = "Contatos Alterado"

        return view
    }
}



