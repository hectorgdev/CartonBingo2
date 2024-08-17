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

        val b1 = findViewById<TextView>(R.id.b1)
        val b2 = findViewById<TextView>(R.id.b2)
        val b3 = findViewById<TextView>(R.id.b3)
        val b4 = findViewById<TextView>(R.id.b4)
        val b5 = findViewById<TextView>(R.id.b5)
        val i1 = findViewById<TextView>(R.id.i1)
        val i2 = findViewById<TextView>(R.id.i2)
        val i3 = findViewById<TextView>(R.id.i3)
        val i4 = findViewById<TextView>(R.id.i4)
        val i5 = findViewById<TextView>(R.id.i5)
        val n1 = findViewById<TextView>(R.id.n1)
        val n2 = findViewById<TextView>(R.id.n2)
        val n3 = findViewById<TextView>(R.id.n3)
        val n4 = findViewById<TextView>(R.id.n4)
        val n5 = findViewById<TextView>(R.id.n5)
        val g1 = findViewById<TextView>(R.id.g1)
        val g2 = findViewById<TextView>(R.id.g2)
        val g3 = findViewById<TextView>(R.id.g3)
        val g4 = findViewById<TextView>(R.id.g4)
        val g5 = findViewById<TextView>(R.id.g5)
        val o1 = findViewById<TextView>(R.id.o1)
        val o2 = findViewById<TextView>(R.id.o2)
        val o3 = findViewById<TextView>(R.id.o3)
        val o4 = findViewById<TextView>(R.id.o4)
        val o5 = findViewById<TextView>(R.id.o5)


        var state: MutableList<Boolean> = mutableListOf()
        for (i in 0..24)
            state.add(i,false)

        b1.setOnClickListener {
            when (state[0]) {
                true -> b1.setBackgroundColor(Color.CYAN)
                false -> b1.setBackgroundColor(Color.RED)
            }
            state[0] = !state[0]

        }
        b2.setOnClickListener {
            when (state[1]) {
                true -> b2.setBackgroundColor(Color.CYAN)
                false -> b2.setBackgroundColor(Color.RED)
            }
            state[1] = !state[1]
        }

        b3.setOnClickListener {
            when (state[2]) {
                true -> b3.setBackgroundColor(Color.CYAN)
                false -> b3.setBackgroundColor(Color.RED)
            }
            state[2] = !state[2]
        }

        b4.setOnClickListener {
            if (state[3]) {
                b4.setBackgroundColor(Color.CYAN)
                state[3] = false
            } else {
                b4.setBackgroundColor(Color.RED)
                state[3] = true
            }
        }
        b5.setOnClickListener {
            if (state[4]) {
                b5.setBackgroundColor(Color.CYAN)
                state[4] = false
            } else {
                b5.setBackgroundColor(Color.RED)
                state[4] = true
            }
        }
        i1.setOnClickListener {
            if (state[5]) {
                i1.setBackgroundColor(Color.CYAN)
                state[5] = false
            } else {
                i1.setBackgroundColor(Color.RED)
                state[5] = true
            }
        }
        i2.setOnClickListener {
            if (state[6]) {
                i2.setBackgroundColor(Color.CYAN)
                state[6] = false
            } else {
                i2.setBackgroundColor(Color.RED)
                state[6] = true
            }
        }
        i3.setOnClickListener {
            if (state[7]) {
                i3.setBackgroundColor(Color.CYAN)
                state[7] = false
            } else {
                i3.setBackgroundColor(Color.RED)
                state[7] = true
            }
        }
        i4.setOnClickListener {
            if (state[8]) {
                i4.setBackgroundColor(Color.CYAN)
                state[8] = false
            } else {
                i4.setBackgroundColor(Color.RED)
                state[8] = true
            }
        }
        i5.setOnClickListener {
            if (state[9]) {
                i5.setBackgroundColor(Color.CYAN)
                state[9] = false
            } else {
                i5.setBackgroundColor(Color.RED)
                state[9] = true
            }
        }
        n1.setOnClickListener {
            if (state[10]) {
                n1.setBackgroundColor(Color.CYAN)
                state[10] = false
            } else {
                n1.setBackgroundColor(Color.RED)
                state[10] = true
            }
        }
        n2.setOnClickListener {
            if (state[11]) {
                n2.setBackgroundColor(Color.CYAN)
                state[11] = false
            } else {
                n2.setBackgroundColor(Color.RED)
                state[11] = true
            }
        }
        n3.setOnClickListener {
            if (state[12]) {
                n3.setBackgroundColor(Color.CYAN)
                state[12] = false
            } else {
                n3.setBackgroundColor(Color.RED)
                state[12] = true
            }
        }
        n4.setOnClickListener {
            if (state[13]) {
                n4.setBackgroundColor(Color.CYAN)
                state[13] = false
            } else {
                n4.setBackgroundColor(Color.RED)
                state[13] = true
            }
        }
        n5.setOnClickListener {
            if (state[14]) {
                n5.setBackgroundColor(Color.CYAN)
                state[14] = false
            } else {
                n5.setBackgroundColor(Color.RED)
                state[14] = true
            }
        }
        g1.setOnClickListener {
            if (state[15]) {
                g1.setBackgroundColor(Color.CYAN)
                state[15] = false
            } else {
                g1.setBackgroundColor(Color.RED)
                state[15] = true
            }
        }
        g2.setOnClickListener {
            if (state[16]) {
                g2.setBackgroundColor(Color.CYAN)
                state[16] = false
            } else {
                g2.setBackgroundColor(Color.RED)
                state[16] = true
            }
        }
        g3.setOnClickListener {
            if (state[17]) {
                g3.setBackgroundColor(Color.CYAN)
                state[17] = false
            } else {
                g3.setBackgroundColor(Color.RED)
                state[17] = true
            }
        }
        g4.setOnClickListener {
            if (state[18]) {
                g4.setBackgroundColor(Color.CYAN)
                state[18] = false
            } else {
                g4.setBackgroundColor(Color.RED)
                state[18] = true
            }
        }
        g5.setOnClickListener {
            if (state[19]) {
                g5.setBackgroundColor(Color.CYAN)
                state[19] = false
            } else {
                g5.setBackgroundColor(Color.RED)
                state[19] = true
            }
        }
        o1.setOnClickListener {
            if (state[20]) {
                o1.setBackgroundColor(Color.CYAN)
                state[20] = false
            } else {
                o1.setBackgroundColor(Color.RED)
                state[20] = true
            }
        }
        o2.setOnClickListener {
            if (state[21]) {
                o2.setBackgroundColor(Color.CYAN)
                state[21] = false
            } else {
                o2.setBackgroundColor(Color.RED)
                state[21] = true
            }
        }
        o3.setOnClickListener {
            if (state[22]) {
                o3.setBackgroundColor(Color.CYAN)
                state[22] = false
            } else {
                o3.setBackgroundColor(Color.RED)
                state[22] = true
            }
        }
        o4.setOnClickListener {
            if (state[23]) {
                o4.setBackgroundColor(Color.CYAN)
                state[23] = false
            } else {
                o4.setBackgroundColor(Color.RED)
                state[23] = true
            }
        }
        o5.setOnClickListener {
            if (state[24]) {
                o5.setBackgroundColor(Color.CYAN)
                state[24] = false
            } else {
                o5.setBackgroundColor(Color.RED)
                state[24] = true
            }
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}
