package com.example.geziuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BursaUluCamiDetay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bursa_ulu_cami_detay)

        val geridon: Button =findViewById(R.id.geridon)

        geridon.setOnClickListener{
            val yenisayfa= Intent(this,BursaPage::class.java)
            startActivity(yenisayfa)
            finish()
        }
    }
}