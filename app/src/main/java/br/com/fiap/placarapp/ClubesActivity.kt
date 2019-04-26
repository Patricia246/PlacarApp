package br.com.fiap.placarapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_clubes.*

class ClubesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        btIniciar.setOnClickListener { minhaView ->
            irPraOutraTela()
        }
    }

    fun irPraOutraTela (){
        val proximaTela = Intent(this, PlacarActivity::class.java)
        proximaTela.putExtra("TIME_CASA", inputClubeCasa.value())
        proximaTela.putExtra("TIME_VISITANTE", inputClubeVisitante.value())
        startActivity(proximaTela)
    }
}
