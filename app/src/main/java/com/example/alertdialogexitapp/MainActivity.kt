package com.example.alertdialogexitapp

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Build simple alert dialog
        var dialogBuilder = AlertDialog.Builder(this)
            .setMessage("Do you want to exit the app?")
            .setPositiveButton("Yes", object : DialogInterface.OnClickListener {
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    this@MainActivity.finish()
                }
            })
            .setNegativeButton("No", object : DialogInterface.OnClickListener {
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    p0?.dismiss()
                }
            })

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            dialogBuilder.show()
        }

        // Material Alert Dialog
        var materialDialog = findViewById<Button>(R.id.button2)
        materialDialog.setOnClickListener {
            startActivity(Intent(this, MaterialDialogActivity::class.java))
        }

    }
}