package com.jaques.projetos.fragment.activity

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.jaques.projetos.fragment.R
import com.jaques.projetos.fragment.fragment.ContatosFragment
import com.jaques.projetos.fragment.fragment.ConversasFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val conversasFragment =  ConversasFragment()
    private val contatosFragment = ContatosFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.elevation = 0f

        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout_conteudo, conversasFragment)
        transaction.commit()

    }


    fun conversa(v: View) {

        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout_conteudo, conversasFragment)
        transaction.commit()
    }

    fun contato(v: View) {

        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout_conteudo, contatosFragment)
        transaction.commit()
    }




}