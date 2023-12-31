package com.example.mad_practical_5

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBrowse:Button = findViewById(R.id.button_browse)
        val editUrl: EditText = findViewById(R.id.edittexturl)

        buttonBrowse.setOnClickListener { openBrowser(editUrl.text.toString()) }


        val buttonCall:Button = findViewById(R.id.button_call)
        val editCall:EditText = findViewById(R.id.edittextcall)

        buttonCall.setOnClickListener { openCall(editCall.text.toString()) }
    }




    fun openBrowser(url:String){
        Intent(Intent.ACTION_VIEW,Uri.parse(url)).also { startActivity(it) }
    }

    fun openCall(number:String){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$number")).also { startActivity(it) }
    }

    fun openCallLog(){
        Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also { startActivity(it) }
    }

    fun openGallery(){
        Intent(Intent.ACTION_VIEW).setType("image/*").also { startActivity(it) }
    }

    fun openCamera(){
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { startActivity(it) }
    }

    fun openAlarm(){
        Intent(AlarmClock.ACTION_SHOW_ALARMS).also { startActivity(it) }
    }
}