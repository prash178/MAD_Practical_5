package com.example.mad_practical_5

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonBrowse:Button=findViewById(R.id.)


    }
    fun opencamera(){
        Intent(Intent.M)

    }
    fun oprnbrowse(url:String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }
    fun opencall(){
    Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel,$")).also { startActivity(it) }
    }
    fun alaram(){
    Intent(Intent.)

    }
    fun calllog(){
      Intent(Intent.ACTION_VIEW).setType(calllog.Calls
    }
}