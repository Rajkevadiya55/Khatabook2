package com.example.khatabook2.Database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Database(context: Context):SQLiteOpenHelper(context,"MYData.db",null,1)  {

    var context=context
    override fun onCreate(db: SQLiteDatabase?) {
       var sql="CREATE TABLE budget( number INTEGER)"
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    fun addData(number:Int) {
        var db=writableDatabase
        var value=ContentValues()
        value.put("number",number)
        db.insert("budget",null,value)

    }


}