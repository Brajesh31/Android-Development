package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        immutable namavariable:Tipedata/object = findviewbyid untuk memanggil object ID
//        dengan memanggil R class

        val judulForm:TextView = findViewById(R.id.judulForm)
        val labelNama:TextView = findViewById(R.id.labelNama)
        val labelkelas:TextView = findViewById(R.id.labelKelas)
        val labelKodeBuku:TextView = findViewById(R.id.labelKodeBuku)

//        kalo input pake edittext
        val inputNama:EditText = findViewById(R.id.inputNama)
        val inputKelas:EditText = findViewById(R.id.inputKelas)
        val inputKodeBuku:EditText = findViewById(R.id.inputKodebuku)

        val btnSubmit:Button = findViewById(R.id.btnSubmit)
        val tampilkanNama:TextView = findViewById(R.id.TampilkanNama)
        val tampilkanKelas:TextView = findViewById(R.id.tampilkanKelas)
        val tampilkanBuku:TextView = findViewById(R.id.TampilkanBuku)

        //buat notif
        btnSubmit.setOnClickListener {
            Toast.makeText(this,"Hello ${tampilkanBuku.text}", Toast.LENGTH_SHORT).show()
            //text = buat isi dan ambil string
            tampilkanNama.text = inputNama.text
            tampilkanKelas.text = inputKelas.text
            val code:Int = inputKodeBuku.text.toString().toInt()

            when(code){
                123 -> tampilkanBuku.text="Harry potter"
                456 -> tampilkanBuku.text = "Alice in wonderland"
                789 -> tampilkanBuku.text = "Villain saga"
                else -> tampilkanBuku.text="Tidak tersedia"
            }
        }


    }
}