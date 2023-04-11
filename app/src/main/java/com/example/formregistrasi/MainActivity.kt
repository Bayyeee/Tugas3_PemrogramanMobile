package com.example.formregistrasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nama = findViewById<EditText>(R.id.nama)
        val alamat = findViewById<EditText>(R.id.alamat)
        val email = findViewById<EditText>(R.id.email)
        val tempat = findViewById<EditText>(R.id.tempat)
        val tanggal = findViewById<EditText>(R.id.tanggal)
        val fakultas = findViewById<EditText>(R.id.fakultas)
        val prodi = findViewById<EditText>(R.id.prodi)
        val submitButton = findViewById<Button>(R.id.submit)

        submitButton.setOnClickListener{
            val name = nama.text.toString()
            val add = alamat.text.toString()
            val mail = email.text.toString()
            val street = tempat.text.toString()
            val date = tanggal.text.toString()
            val fakul = fakultas.text.toString()
            val jurusan = prodi.text.toString()

            val intent = Intent(this, OutputActivity::class.java)
            intent.putExtra("nama", name)
            intent.putExtra("alamat", add)
            intent.putExtra("email", mail)
            intent.putExtra("tempat", street)
            intent.putExtra("tanggal", date)
            intent.putExtra("fakultas", fakul)
            intent.putExtra("prodi", jurusan)
            startActivity(intent)
        }
    }

}