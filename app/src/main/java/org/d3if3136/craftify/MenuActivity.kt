package org.d3if3136.craftify

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.d3if3136.craftify.databinding.ActivityMainBinding


class MenuActivity : AppCompatActivity() {
    companion object {
        var nama = "nama"
    }
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_menu)
        val tombol = findViewById<Button>(R.id.btnSubmit)

        tombol.setOnClickListener {
            val tombol = Intent(this@MenuActivity, MainActivity::class.java)
            startActivity(tombol)
        }
    }

//    private fun nama() {
//        val nama = binding.namaInp.text.toString()
//        if (TextUtils.isEmpty(nama)) {
//            Toast.makeText(this, R.string.nama_invalid, Toast.LENGTH_LONG).show()
//            return
//        }
//    }
}