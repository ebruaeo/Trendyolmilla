package com.example.trendyolmilla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trendyolmilla.data.entity.UrunData
import com.example.trendyolmilla.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val categories = arrayOf(
            R.drawable.woman,
            R.drawable.man,
            R.drawable.curve,
            R.drawable.modest,
            R.drawable.edit,
        )

        binding.kategoriRecyclerView.adapter = ItemCategoryAdapter(categories)
        val products = arrayOf(
            UrunData(R.drawable.pantolon,"TRENDYOLMİLLA", "Siyah Kemeri Cırtlı Yüksek Bel Pileli Wide Leg Örme Pantolon",311.99),
            UrunData(R.drawable.elbise,"TRENDYOLMİLLA", "Siyah Tüvit A Kesim Mini Şifon Kol Detaylı Dokuma Elbise",299.99),
            UrunData(R.drawable.pijama,"TRENDYOLMİLLA", "Çok Renkli Kalpli Biye Detaylı Viskon Gömlek-Pantolon Dokuma Pijama Takımı",325.99),
            UrunData(R.drawable.gomlek,"TRENDYOLMİLLA", "Sagaza Studio Açık Mavi Büzgü Detaylı Poplin Gömlek",489.99),

        )

        binding.urunlerRecyclerView.adapter = PopulerUrunlerAdapter(products)


    }
}