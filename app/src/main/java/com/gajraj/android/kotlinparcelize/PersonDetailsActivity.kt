package com.gajraj.android.kotlinparcelize

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gajraj.android.kotlinparcelize.model.Person
import org.jetbrains.anko.toast

/**
 * Created by Gajraj on 5/30/2018.
 */
class PersonDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person_details)
        catchIntent()
    }

    private fun catchIntent() {
        val personObject = intent.extras.getParcelable<Person>("personObject")
        toast("Got Person :" + personObject.name)
    }
}