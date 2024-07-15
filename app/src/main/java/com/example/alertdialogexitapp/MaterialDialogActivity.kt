package com.example.alertdialogexitapp

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder

/**
 * @author Shajib
 * @since Jul 15, 2024
 **/
class MaterialDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var materialDialog = MaterialAlertDialogBuilder(this)
        var view = LayoutInflater.from(this).inflate(R.layout.material_dialog_view, null, false)
        materialDialog.setView(view)
        materialDialog.show()

        var nameEditText = view.findViewById<EditText>(R.id.etName)
        var ageEditText = view.findViewById<EditText>(R.id.etAge)
        var submitButton = view.findViewById<Button>(R.id.dialog_button)

        submitButton.setOnClickListener {
            try {
                var name = nameEditText?.text?.toString()?.trim()
                var age = ageEditText?.text?.toString()?.trim()?.toInt()

                Toast.makeText(this, "Name: $name, Age: $age", Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                Toast.makeText(this, "Please enter name and age", Toast.LENGTH_SHORT).show()
                e.printStackTrace()
            }
        }

    }
}