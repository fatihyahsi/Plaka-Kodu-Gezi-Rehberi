package com.example.geziuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BalikesirPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balikesir_page)
        val ayvalikdetay : Button =findViewById(R.id.ayvalikdetay)
        val bandirmadetay: Button =findViewById(R.id.bandirmadetay)

        val geribtn: Button =findViewById(R.id.button4)
        geribtn.setOnClickListener{
            val yenisayfa= Intent(this,MainActivity::class.java)
            startActivity(yenisayfa)
            finish()
        }
        ayvalikdetay.setOnClickListener{
            val yenisayfa= Intent(this,AyvalikDetay::class.java)
            startActivity(yenisayfa)
            finish()
        }
        bandirmadetay.setOnClickListener{
            val yenisayfa= Intent(this,BandirmaDetay::class.java)
            startActivity(yenisayfa)
            finish()
        }
    }
}