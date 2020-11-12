package com.example.sqlitekotlinadddata

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var helper = MyDBHelper(applicationContext)
        var db = helper.readableDatabase

        button.setOnClickListener {
            var cv = ContentValues()
            cv.put("USERNAME",editTextTextEmailAddress.text.toString())
            cv.put("PASSWORD",editTextTextPassword.text.toString())
            db.insert("USER",null,cv)
        }
        var rs = db.rawQuery("SELECT * FROM USER",null)

        if (rs.moveToNext()){
            Toast.makeText(applicationContext,rs.getString(1),Toast.LENGTH_LONG).show()
        }

    }
}