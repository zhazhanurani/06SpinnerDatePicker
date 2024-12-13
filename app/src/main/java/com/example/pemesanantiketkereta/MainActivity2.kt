package com.example.pemesanantiketkereta

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pemesanantiketkereta.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra("nama")
        val jam = intent.getStringExtra("jam")
        val tanggal = intent.getStringExtra("tanggal")
        val tujuan = intent.getStringExtra("tujuan")
        val harga = intent.getStringExtra("harga")

        // Tampilkan data di TextView menggunakan binding
        binding.Nama.text = nama
        binding.Jam.text = jam
        binding.Tanggal.text = tanggal
        binding.Tujuan.text = tujuan
        binding.Harga.text = harga
    }
}