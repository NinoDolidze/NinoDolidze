package com.example.registrationform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var nameInput: EditText
    private lateinit var lastNameInput: EditText
    private lateinit var numberInput: EditText
    private lateinit var personalNumberInput: EditText
    private lateinit var registrationButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameInput = findViewById(R.id.nameInput)
        lastNameInput = findViewById(R.id.lastNameInput)
        numberInput = findViewById(R.id.numberInput)
        personalNumberInput = findViewById(R.id.personalNumberInput)
        registrationButton = findViewById(R.id.registrationButton)

        registrationButton.setOnClickListener {

            val name = nameInput.text.toString()

            if (name.isEmpty()){
                Toast.makeText(this, "შეავსეთ სახელის ველი", Toast.LENGTH_SHORT).show()
            }
            if (name.length <= 3) {
                Toast.makeText(this, "ველში არასაკმარისი სიმბოლოა", Toast.LENGTH_SHORT).show()
            }

            val lastName = lastNameInput.text.toString()

            if (lastName.isEmpty()) {
                Toast.makeText(this, "შეავსეთ გვარის ველი", Toast.LENGTH_SHORT).show()
            }
            if (lastName.length <=5) {
                Toast.makeText(this, "ველში არასაკმარისი სიმბოლოა", Toast.LENGTH_SHORT).show()
            }
            val number = numberInput.text.toString()

            if (number.isEmpty()) {
                Toast.makeText(this, "შეავსეთ ნომერის ველი", Toast.LENGTH_SHORT).show()
            }

            Toast.makeText(this, "რეგისტრაციის ოპერაცია წარმატებულია", Toast.LENGTH_SHORT).show()
        }


    }
}