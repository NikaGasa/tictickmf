package com.example.nika

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var button1 : Button
    private lateinit var button2 : Button
    private lateinit var button3 : Button
    private lateinit var button4 : Button
    private lateinit var button5 : Button
    private lateinit var button6 : Button
    private lateinit var button7 : Button
    private lateinit var button8 : Button
    private lateinit var button9 : Button
    private lateinit var Refresh : Button
    private lateinit var pl1point : TextView
    private lateinit var pl2point : TextView


    private var Activeplayer = 1
    private var firstplayer = ArrayList<Int>()
    private var secondplayer = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

    }

    override fun onClick(clickedView: View) {
        if (clickedView is Button) {
            var buttonumber = 0
            when(clickedView.id){
                R.id.button1 -> buttonumber = 1
                R.id.button2 -> buttonumber = 2
                R.id.button3 -> buttonumber = 3
                R.id.button4 -> buttonumber = 4
                R.id.button5 -> buttonumber = 5
                R.id.button6 -> buttonumber = 6
                R.id.button7 -> buttonumber = 7
                R.id.button8 -> buttonumber = 8
                R.id.button9 -> buttonumber = 9
            }
            if(buttonumber != 0){
                playgame(clickedView, buttonumber)
            }
        }
    }

    private fun playgame(clickedView: Button, buttonumber: Int) {
        if(Activeplayer == 1){
            clickedView.text = "X"
            clickedView.setBackgroundColor(Color.RED)
            Activeplayer = 2
            firstplayer.add(buttonumber)
        }
        else{
            clickedView.text = "O"
            Activeplayer == 1
            clickedView.setBackgroundColor(Color.RED)
            secondplayer.add(buttonumber)
        }
        clickedView.isEnabled = false
        check()
    }

    private fun check() {
        var winner = 0
        if(firstplayer.contains(1) && firstplayer.contains(2) && firstplayer.contains(3)){
            winner = 1
        }
        if(secondplayer.contains(1) && secondplayer.contains(2) && secondplayer.contains(3)){
            winner = 1
        }
        if(firstplayer.contains(1) && firstplayer.contains(5) && firstplayer.contains(9)){
            winner = 1
        }
        if(secondplayer.contains(1) && secondplayer.contains(5) && secondplayer.contains(9)){
            winner = 1
        }
        if(firstplayer.contains(1) && firstplayer.contains(4) && firstplayer.contains(7)){
            winner = 1
        }
        if(secondplayer.contains(1) && secondplayer.contains(4) && secondplayer.contains(7)){
            winner = 1
        }
        if(firstplayer.contains(2) && firstplayer.contains(5) && firstplayer.contains(8)) {
            winner = 1
        }
        if(secondplayer.contains(2) && secondplayer.contains(5) && secondplayer.contains(8)) {
            winner = 1
        }
        if(firstplayer.contains(3) && firstplayer.contains(6) && firstplayer.contains(9)) {
            winner = 1
        }
        if(secondplayer.contains(3) && secondplayer.contains(6) && secondplayer.contains(9)) {
            winner = 1
        }
        if(firstplayer.contains(3) && firstplayer.contains(5) && firstplayer.contains(7)) {
            winner = 1
        }
        if(secondplayer.contains(3) && secondplayer.contains(5) && secondplayer.contains(7)) {
            winner = 1
        }
        if(firstplayer.contains(3) && firstplayer.contains(4) && firstplayer.contains(5)) {
            winner = 1
        }
        if(secondplayer.contains(3) && secondplayer.contains(5) && secondplayer.contains(4)) {
            winner = 1
        }
        if(firstplayer.contains(7) && firstplayer.contains(8) && firstplayer.contains(9)) {
            winner = 1
        }
        if(secondplayer.contains(7) && secondplayer.contains(8) && secondplayer.contains(9)) {
            winner = 1
        }

    }

    private fun init(){
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        Refresh = findViewById(R.id.refresh)
        pl1point = findViewById(R.id.pl1point)
        pl2point = findViewById(R.id.pl2point)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
    }
    fun Refresh() {
        button1.isEnabled = true
        button2.isEnabled = true
        button3.isEnabled = true
        button4.isEnabled = true
        button5.isEnabled = true
        button6.isEnabled = true
        button7.isEnabled = true
        button8.isEnabled = true
        button9.isEnabled = true

        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
        button7.text = ""
        button8.text = ""
        button9.text = ""


        firstplayer.clear()
        secondplayer.clear()
    }

}