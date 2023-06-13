package com.example.geziuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BursaPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bursa_page)
        val ulucamidetay :Button=findViewById(R.id.ayvalikdetay)
        val kozahandetay:Button =findViewById(R.id.bandirmadetay)

        val geribtn:Button=findViewById(R.id.button4)
        geribtn.setOnClickListener{
            val yenisayfa= Intent(this,MainActivity::class.java)
            startActivity(yenisayfa)
            finish()
        }
        ulucamidetay.setOnClickListener{
            val yenisayfa= Intent(this,BursaUluCamiDetay::class.java)
            startActivity(yenisayfa)
            finish()
        }
        kozahandetay.setOnClickListener{
            val yenisayfa= Intent(this,BursaKozaHanDetay::class.java)
            startActivity(yenisayfa)
            finish()
        }
    }
}