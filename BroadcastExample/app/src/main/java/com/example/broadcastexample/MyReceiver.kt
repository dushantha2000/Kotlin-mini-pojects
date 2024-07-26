package com.example.broadcastexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isEnabled:Boolean= intent?.getBooleanExtra("state",false) ?:false
        if (isEnabled==true){
            Toast.makeText(context,"Airplane mode turned on ",Toast.LENGTH_LONG).show()
        }else {
            Toast.makeText(context,"Airplane mode turned on ",Toast.LENGTH_LONG).show()

        }
    }

}