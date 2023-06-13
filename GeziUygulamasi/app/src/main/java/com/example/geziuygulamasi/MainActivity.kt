package com.example.geziuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edittext : EditText = findViewById(R.id.edittextplakaisim)
        val grsbtn : Button =findViewById(R.id.grsbtn)
edittext.setOnClickListener{
    //tıklanınca içindeki metni silme
    edittext.setText("")
}

        grsbtn.setOnClickListener{

            val text = edittext.text.toString()
            if (text == "16"|| text =="bursa") {
                val yenisayfa= Intent(this,BursaPage::class.java)
                startActivity(yenisayfa)
                finish()
            } else if (text == "manisa" || text == "45") {
                val yenisayfa= Intent(this,ManisaPage::class.java)
                startActivity(yenisayfa)
                finish()
            } else if (text == "istanbul" || text == "34") {
                val yenisayfa= Intent(this,IstanbulPage::class.java)
                startActivity(yenisayfa)
                finish()
            } else if (text == "aksaray" || text == "68") {
                val yenisayfa= Intent(this,AksarayPage::class.java)
                startActivity(yenisayfa)
                finish()
            } else if (text == "kırıkkale" || text == "71") {
                val yenisayfa= Intent(this,KirikkalePage::class.java)
                startActivity(yenisayfa)
                finish()
            }
            else if (text == "balıkesir" || text == "10") {
                val yenisayfa= Intent(this,BalikesirPage::class.java)
                startActivity(yenisayfa)
                finish()
            } else {
                Toast.makeText(applicationContext,"İstenilen Şehir Bulunamadı", Toast.LENGTH_LONG).show()
            }
        }



    }
}