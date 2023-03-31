package org.d3if3136.craftify

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import org.d3if3136.craftify.databinding.ActivityMainBinding

class IntroMenu : AppCompatActivity() {
    companion object {
        var intro = "intro"
    }
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_intro)
        val klik = findViewById<Button>(R.id.viewList)

        klik.setOnClickListener {
            val klik = Intent(this@IntroMenu, MainActivity::class.java)
            startActivity(klik)
        }
    }
}