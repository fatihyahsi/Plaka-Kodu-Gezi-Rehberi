package com.example.geziuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KirikkalePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kirikkale_page)
        val nurcamidetay : Button =findViewById(R.id.ayvalikdetay)
        val cesnigirdetay: Button =findViewById(R.id.bandirmadetay)

        val geribtn: Button =findViewById(R.id.button4)
        geribtn.setOnClickListener{
            val yenisayfa= Intent(this,MainActivity::class.java)
            startActivity(yenisayfa)
            finish()
        }
        nurcamidetay.setOnClickListener{
            val yenisayfa= Intent(this,NurCamiiDetay::class.java)
            startActivity(yenisayfa)
            finish()
        }
        cesnigirdetay.setOnClickListener{
            val yenisayfa= Intent(this,CesnigirKopruDetay::class.java)
            startActivity(yenisayfa)
            finish()
        }
    }
}