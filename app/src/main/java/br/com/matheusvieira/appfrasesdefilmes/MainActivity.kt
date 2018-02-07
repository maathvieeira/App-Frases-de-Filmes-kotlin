package br.com.matheusvieira.appfrasesdefilmes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf(
            "1ª Regra - Sempre seja a pessoa mais inteligente da sala - Truque de Mestre",
            "Amortecer a dor por algum tempo apenas a tornará pior quando você finalmente a sentir - Harry Potter",
            "Porque onde estiver o vosso tesouro, aí estará também o vosso coração - Harry Potter"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.txtFrase)
    }

    fun gerarFrase(view: View){

        val totalItensArray = frases.size
        val numeroAleatorio = Random().nextInt( totalItensArray )

        texto.setText(frases[ numeroAleatorio ])

    }

}
