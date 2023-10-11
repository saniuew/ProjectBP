package com.example.projectbp2665

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnMore:Button = findViewById(R.id.menu4)
        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)
        //set layout manager di RecyclerView
        rvBuku.layoutManager = LinearLayoutManager(this)
        //list data buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1,"Emi's Beach Adventure", "Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book2,"Emi's Beach Adventure", "Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book4,"Emi's Beach Adventure", "Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book2,"Emi's Beach Adventure", "Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book1,"Emi's Beach Adventure", "Lorem Ipsum Dolor Sit Amet"))

        val adapter = AdapterHome(data)
        rvBuku.adapter = adapter
        val btnFairy: Button = findViewById(R.id.buttonMenu1)

        btnFairy.setOnClickListener{
            val Intent = Intent(this,BookKidActivity::class.java)
            startActivity(Intent)
        }
    }
}