package com.example.sqlitekotlinadddata

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class MyDBHelper (var context: Context): SQLiteOpenHelper(context,"USERDB",null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE USER(USERID INTEGER PRIMARY KEY AUTOINCREMENT, USERNAME TEXT, PASSWORD TEXT)")
        db?.execSQL("INSERT INTO USER(USERNAME, PASSWORD)VALUES ('ridoy','ridoy')")
        db?.execSQL("INSERT INTO USER(USERNAME, PASSWORD)VALUES ('simala','simla')")
        Toast.makeText(context,"onCreate is called", Toast.LENGTH_LONG).show()
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}