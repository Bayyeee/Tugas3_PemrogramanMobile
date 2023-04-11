package com.example.formregistrasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OutputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        var intent = intent
        val name = intent.getStringExtra("nama")
        val alamat = intent.getStringExtra("alamat")
        val email = intent.getStringExtra("email")
        val tempat = intent.getStringExtra("tempat")
        val tanggal = intent.getStringExtra("tanggal")
        val fakultas = intent.getStringExtra("fakultas")
        val prodi = intent.getStringExtra("prodi")

        val data1 = findViewById<TextView>(R.id.data1)
        data1.text = "nama : " + name
        val data2 = findViewById<TextView>(R.id.data2)
        data2.text = "alamat : " + alamat
        val data3 = findViewById<TextView>(R.id.data3)
        data3.text = "email : " + email
        val data4 = findViewById<TextView>(R.id.data4)
        data4.text = "tempat : " + tempat
        val data5 = findViewById<TextView>(R.id.data5)
        data5.text = "tanggal : " + tanggal
        val data6 = findViewById<TextView>(R.id.data6)
        data6.text = "fakultas : " + fakultas
        val data7 = findViewById<TextView>(R.id.data7)
        data7.text = "prodi : " + prodi

    }
}