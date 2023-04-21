package com.example.pr2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Pizza1_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza1_page)
        val textbutton1 = findViewById<TextView>(R.id.valp)
        val textbutton2 = findViewById<TextView>(R.id.textView16)
        val textbutton3 = findViewById<TextView>(R.id.textshow3)
        val bottomSheetFragment = BottomSheetFragment() /*создает новый экземпляр класса `BottomSheetFragment`*/
        textbutton1.setOnClickListener {
//            Устанавливаю слушатель на текст
            bottomSheetFragment.show(supportFragmentManager,"BottomSheetDialog")
//            лткрывает диалоговое окно нижнего экрана с помощью метода `show` объекта `bottomSheetFragment`.
        }
        textbutton2.setOnClickListener {
            bottomSheetFragment.show(supportFragmentManager,"BottomSheetDialog")
        }
        textbutton3.setOnClickListener {
            bottomSheetFragment.show(supportFragmentManager,"BottomSheetDialog")
        }



    }
}