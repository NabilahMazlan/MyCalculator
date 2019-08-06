package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var input = ""
    var input2 = ""
    var output = 0.0
    var operator = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun btnOnClick(view : View){
        var anotherNum = textViewInput.text.toString()
        val btnSelected = view as Button
        if(textViewInput.text.toString().equals("0")){
            textViewInput.text = ""
            when (btnSelected.id) {
                button1.id -> textViewInput.text = "1"
                button2.id -> textViewInput.text = "2"
                button3.id -> textViewInput.text = "3"
                button4.id -> textViewInput.text = "4"
                button5.id -> textViewInput.text = "5"
                button6.id -> textViewInput.text = "6"
                button7.id -> textViewInput.text = "7"
                button8.id -> textViewInput.text = "8"
                button9.id -> textViewInput.text = "9"
                button0.id -> textViewInput.text = "0"
                buttonDot.id -> textViewInput.text = textViewInput.text.toString() + "."

            }
            input = textViewInput.text.toString()

        }else{
            when (btnSelected.id) {
                button1.id -> textViewInput.text = anotherNum + "1"
                button2.id -> textViewInput.text = anotherNum + "2"
                button3.id -> textViewInput.text = anotherNum + "3"
                button4.id -> textViewInput.text = anotherNum + "4"
                button5.id -> textViewInput.text = anotherNum + "5"
                button6.id -> textViewInput.text = anotherNum + "6"
                button7.id -> textViewInput.text = anotherNum + "7"
                button8.id -> textViewInput.text = anotherNum + "8"
                button9.id -> textViewInput.text = anotherNum + "9"
                button0.id -> textViewInput.text = anotherNum + "0"
                buttonDot.id -> textViewInput.text = textViewInput.text.toString() + "."


            }
        }



    }

    fun btnOnOppClick(view : View){
        input2 = textViewInput.text.toString()
        textViewInput.text = ""
        val btnSelected = view as Button
        when (btnSelected.id) {
            buttonPlus.id -> operator = "+"
            buttonMinus.id -> operator = "-"
            buttonSlash.id -> operator = "/"
            buttonAsterick.id -> operator = "*"

        }

    }

    fun btnOnEqualsClick(view : View){
        if(input != ""){
            if(operator == "+"){
                output = input2.toDouble() + textViewInput.text.toString().toDouble()
            }else if(operator == "-"){
                output = input2.toDouble() - textViewInput.text.toString().toDouble()

            }else if(operator == "/"){
                output = input2.toDouble() / textViewInput.text.toString().toDouble()

            }else{
                output = input2.toDouble() * textViewInput.text.toString().toDouble()

            }
            textViewOutput.text = "$output"
        }else if (textViewInput.text.toString() == "0"){
            Toast.makeText(this, "Please enter a few numbers", Toast.LENGTH_SHORT).show()
        }


    }

    fun btnOnResetClick(view : View){
        textViewOutput.text = "0"
        textViewInput.text = "0"
        input2 = ""
        input = ""

    }


}
