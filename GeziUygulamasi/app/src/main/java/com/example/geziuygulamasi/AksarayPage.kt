package com.example.geziuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AksarayPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aksaray_page)
        val hasandagdetay : Button =findViewById(R.id.ayvalikdetay)
        val ihlaradetay: Button =findViewById(R.id.bandirmadetay)

        val geribtn: Button =findViewById(R.id.button4)
        geribtn.setOnClickListener{
            val yenisayfa= Intent(this,MainActivity::class.java)
            startActivity(yenisayfa)
            finish()
        }
        hasandagdetay.setOnClickListener{
            val yenisayfa= Intent(this,Hasandagdetay::class.java)
            startActivity(yenisayfa)
            finish()
        }
        ihlaradetay.setOnClickListener{
            val yenisayfa= Intent(this,IhlaraDetay::class.java)
            startActivity(yenisayfa)
            finish()
        }
    }
}