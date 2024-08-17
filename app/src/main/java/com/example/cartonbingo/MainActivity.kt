package com.example.cartonbingo

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        data class buttonInfo(val id: Int, val textView: TextView)


        val button = listOf(
            buttonInfo(R.id.b1, findViewById(R.id.b1)),
            buttonInfo(R.id.b2, findViewById(R.id.b2)),
            buttonInfo(R.id.b3, findViewById(R.id.b3)),
            buttonInfo(R.id.b4, findViewById(R.id.b4)),
            buttonInfo(R.id.b5, findViewById(R.id.b5)),
            buttonInfo(R.id.i1, findViewById(R.id.i1)),
            buttonInfo(R.id.i2, findViewById(R.id.i2)),
            buttonInfo(R.id.i3, findViewById(R.id.i3)),
            buttonInfo(R.id.i4, findViewById(R.id.i4)),
            buttonInfo(R.id.i5, findViewById(R.id.i5)),
            buttonInfo(R.id.n1, findViewById(R.id.n1)),
            buttonInfo(R.id.n2, findViewById(R.id.n2)),
            buttonInfo(R.id.n3, findViewById(R.id.n3)),
            buttonInfo(R.id.n4, findViewById(R.id.n4)),
            buttonInfo(R.id.n5, findViewById(R.id.n5)),
            buttonInfo(R.id.g1, findViewById(R.id.g1)),
            buttonInfo(R.id.g2, findViewById(R.id.g2)),
            buttonInfo(R.id.g3, findViewById(R.id.g3)),
            buttonInfo(R.id.g4, findViewById(R.id.g4)),
            buttonInfo(R.id.g5, findViewById(R.id.g5)),
            buttonInfo(R.id.o1, findViewById(R.id.o1)),
            buttonInfo(R.id.o2, findViewById(R.id.o2)),
            buttonInfo(R.id.o3, findViewById(R.id.o3)),
            buttonInfo(R.id.o4, findViewById(R.id.o4)),
            buttonInfo(R.id.o5, findViewById(R.id.o5)),
        )
        val state = MutableList<Boolean>(25) { false }
        for (buttonInfo in button){
            val index = button.indexOf(buttonInfo)
            buttonInfo.textView.setOnClickListener {
                when(state[index]){
                    true -> buttonInfo.textView.setBackgroundColor(Color.CYAN)
                    false -> buttonInfo.textView.setBackgroundColor(Color.RED)
                }
                state[index] = !state[index]
            }

        }

    }
}
