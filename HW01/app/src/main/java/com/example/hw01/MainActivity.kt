package com.example.hw01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text01:TextView = findViewById(R.id.text01)
        text01.setText("Malong")
//        var text02:EditText = findViewById(R.id.text02)
//        text02.setText("Username")
//        var text03:EditText = findViewById(R.id.text03)
//        text03.setText("Password")
//        var text04:EditText = findViewById(R.id.text04)
//        text04.setText("Confirm")
        var editname: EditText = findViewById(R.id.username)
        var editpass: EditText = findViewById(R.id.password)
        var editcpass: EditText = findViewById(R.id.confirm)
        var ok: Button = findViewById(R.id.buttonOK)
        var clear: Button = findViewById(R.id.buttonclear)

        clear.setOnClickListener() {
            editname.setText("")
            editpass.setText("")
            editcpass.setText("")
            val toast = Toast.makeText(applicationContext, "ลบสำเร็จ!!!", Toast.LENGTH_LONG)
            toast.show()
        }
        ok.setOnClickListener() {
            var user = editname.text.toString()
            var pass1 = editpass.text.toString()
            var pass2 = editcpass.text.toString()
            if(user == ""  ||pass1 == ""  ||pass2 == ""){
            Toast.makeText(applicationContext, "กรุณากรอกให้ครบ", Toast.LENGTH_LONG).show()
        }
            else if(user == pass1 && user == pass2) {
            Toast.makeText(applicationContext, "อย่ากรอก Username ตรงกับ Password", Toast.LENGTH_LONG).show()
        }
        else if(pass1 != pass2){
            Toast.makeText(applicationContext, "กรุณากรอกพาสให้ตรงกัน", Toast.LENGTH_LONG).show()

        }
        else{
            Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
        }
        }


    }
}