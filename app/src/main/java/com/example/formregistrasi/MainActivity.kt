package com.example.formregistrasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button
import android.widget.DatePicker
import android.widget.RadioButton
import android.widget.TextView
import java.util.Calendar

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nama = findViewById<EditText>(R.id.nama)
        val alamat = findViewById<EditText>(R.id.alamat)
        val email = findViewById<EditText>(R.id.email)
        val tempat = findViewById<EditText>(R.id.tempat)
        val tanggal = findViewById<DatePicker>(R.id.tanggal)
        val fakultas = findViewById<EditText>(R.id.fakultas)
        val prodi = findViewById<EditText>(R.id.prodi)
        val submitButton = findViewById<Button>(R.id.submit)
        val button1 = findViewById<RadioButton>(R.id.laki)
        val button2 = findViewById<RadioButton>(R.id.perempuan)

        submitButton.setOnClickListener{
            val name = nama.text.toString()
            val add = alamat.text.toString()
            val mail = email.text.toString()
            val street = tempat.text.toString()
            val fakul = fakultas.text.toString()
            val jurusan = prodi.text.toString()
            val kelamin = if (button1.isChecked) "Laki - laki" else "Perempuan"
            val calendar = Calendar.getInstance()
            tanggal.updateDate(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            )

            val day = tanggal.dayOfMonth
            val month = tanggal.month + 1
            val year = tanggal.year

            val intent = Intent(this, OutputActivity::class.java)
            intent.putExtra("nama", name)
            intent.putExtra("alamat", add)
            intent.putExtra("email", mail)
            intent.putExtra("tempat", street)
            intent.putExtra("fakultas", fakul)
            intent.putExtra("prodi", jurusan)
            intent.putExtra("kelamin", kelamin)
            intent.putExtra("tanggal", "$day/$month/$year")
            startActivity(intent)
        }
    }

}