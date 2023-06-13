package com.example.geziuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ManisaPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manisa_page)
        val spildetay : Button =findViewById(R.id.ayvalikdetay)
        val aglayandetay: Button =findViewById(R.id.bandirmadetay)

        val geribtn: Button =findViewById(R.id.button4)
        geribtn.setOnClickListener{
            val yenisayfa= Intent(this,MainActivity::class.java)
            startActivity(yenisayfa)
            finish()
        }
        spildetay.setOnClickListener{
            val yenisayfa= Intent(this,SpilDetay::class.java)
            startActivity(yenisayfa)
            finish()
        }
        aglayandetay.setOnClickListener{
            val yenisayfa= Intent(this,AglayanDetay::class.java)
            startActivity(yenisayfa)
            finish()
        }
    }
}