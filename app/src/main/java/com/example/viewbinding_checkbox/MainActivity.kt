package com.example.viewbinding_checkbox

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isNotEmpty
import com.example.viewbinding_checkbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            if (binding.checkBox.isChecked&& !binding.name.text.isNullOrBlank()){
                val intent=Intent(this,MainActivity2::class.java)
                startActivity(intent)
                //open new screen
            }else{
                binding.checkBox.buttonTintList= ColorStateList.valueOf(Color.RED)
                Toast.makeText(this, "please accept the T&amp;C", Toast.LENGTH_SHORT).show()
            }
        }
    }
}