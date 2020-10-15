package com.example.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts = mutableListOf<Contact>()
        contacts.add(Contact("toto", 15, "photo1",true))
        contacts.add(Contact("toti", 20, "photo1",false))
        contacts.add(Contact("tota", 2, "photo1",true))
        contacts.add(Contact("toton", 60, "photo1",false))
        contacts.add(Contact("totu", 31, "photo1",true))

        val adaptor = ContactAdaptor(contacts)
        recyclerView.adapter = adaptor

    }
}