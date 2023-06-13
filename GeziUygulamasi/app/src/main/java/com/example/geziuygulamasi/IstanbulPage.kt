package com.example.geziuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IstanbulPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_istanbul_page)

        val ayasofyadetay : Button =findViewById(R.id.ayvalikdetay)
        val topkapidetay: Button =findViewById(R.id.bandirmadetay)

        val geribtn: Button =findViewById(R.id.button4)
        geribtn.setOnClickListener{
            val yenisayfa= Intent(this,MainActivity::class.java)
            startActivity(yenisayfa)
            finish()
        }
        ayasofyadetay.setOnClickListener{
            val yenisayfa= Intent(this,AyasofyaDetay::class.java)
            startActivity(yenisayfa)
            finish()
        }
        topkapidetay.setOnClickListener{
            val yenisayfa= Intent(this,TopkapiDetay::class.java)
            startActivity(yenisayfa)
            finish()
        }
    }
}