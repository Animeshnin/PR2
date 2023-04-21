package com.example.pr2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import java.util.Objects
import java.util.regex.Pattern

class Register : AppCompatActivity() {
    private lateinit  var email: EditText
    // нициализирован до того момента, пока не будет назначено значение.
    private lateinit  var pass: EditText
   private lateinit  var butt: Button






    val pattern = "^([a-zA-Z0-9]{1,100})@([a-z]{1,10})\\.([a-z]{1,4})$"
//    [a-zA-Z0-9] содержит от 1 до 100 символов латиницы (буквы a-z, A-Z) или цифр (0-9) @ разделяющий имя пользователя и доменное имя








    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        email = findViewById(R.id.userEmail)
        pass = findViewById(R.id.password)
        butt = findViewById(R.id.button)
//        Добавляем слушатеть изменения текста textWatcher, применяются для отслеживания изменений ввода пользователей
        email.addTextChangedListener(textWatcher)
        pass.addTextChangedListener(textWatcher)
        butt.addTextChangedListener(textWatcher)






    }


    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            // Оцениваем состояние EditText и активируем или деактивируем кнопку
            val email_as = email.text.toString().trim()
            val password = pass.text.toString().trim()
//           трим удаляет все пробелы
            if(email_as.isNotEmpty()&&password.isNotEmpty())
            {
                butt.isEnabled =true // делает кнопку butt активной,
                val myButton = findViewById<Button>(R.id.button)
                myButton.setBackgroundColor(Color.BLACK)
//                 устанавливает черный цвет фона кнопки myButton.
            }
            else{
                butt.isEnabled =false
            }

        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
    }

    fun emailValid(text:String):Boolean{
        return Pattern.compile(pattern).matcher(text).matches()
    }
    fun next(view: View) {
        if(email.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty())
        {
            if (emailValid(email.text.toString())){
                val intent=Intent(this,nezn::class.java)
                startActivity(intent)
                finish()
            }
            else{
                Toast.makeText(this,"ошибка при заполнении поля email",Toast.LENGTH_SHORT).show()
            }
        }
    }
}