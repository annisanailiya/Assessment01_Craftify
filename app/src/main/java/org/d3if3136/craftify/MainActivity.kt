package org.d3if3136.craftify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if3136.craftify.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
    }

    private fun getData(): List<Kerajinan> {
        return listOf(
            Kerajinan("Bunga", "kertas/origami"),
            Kerajinan("Bunga", "pita besar"),
            Kerajinan("Bingkai Foto", "stick ice cream"),
            Kerajinan("Bingkai Foto", "kardus bekas"),
            Kerajinan("Dreamcather", "benang, kayu"),
            Kerajinan("Gantungan Kunci", "batok kelapa"),
            Kerajinan("Gelang", "tali sepatu"),
            Kerajinan("Kotak Pensil", "kain flanel"),
            Kerajinan("Vas Bunga", "kertas koran"),
            Kerajinan("Vas Bunga", "stick ice cream")
        )
    }


}