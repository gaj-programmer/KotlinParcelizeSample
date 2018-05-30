package com.gajraj.android.kotlinparcelize

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gajraj.android.kotlinparcelize.model.Person
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialization()
        sendPersonDetails()
    }

    private fun initialization() {
        toast("initialization")
    }

    private fun sendPersonDetails() {
        /* #Sample for Parcelize */
        val intent = Intent(this, PersonDetailsActivity::class.java)
        intent.putExtra("personObject", Person(101, "Arya", "Bangalore", 24))
        startActivity(intent)
    }
}
