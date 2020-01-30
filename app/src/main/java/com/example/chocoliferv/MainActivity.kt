package com.example.chocoliferv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTickets.adapter = TicketAdapter(generateTickets())
        rvTickets.layoutManager = LinearLayoutManager(this)
    }

    private fun generateTickets(): List<TicketModel> {
        val list = ArrayList<TicketModel>()
        list.add(
            TicketModel(
                "https://www.eturbonews.com/wp-content/uploads/2018/09/snowboarding.jpg",
                "Экстремал",
                4.8f,
                "Прокат коньков, горнолыжных костюмов, снаряжения и аксессуаров",
                239,
                5000
            )
        )
        list.add(
            TicketModel(
                "https://www.eturbonews.com/wp-content/uploads/2018/09/snowboarding.jpg",
                "Экстремал",
                4.8f,
                "Прокат коньков, горнолыжных костюмов, снаряжения и аксессуаров",
                239,
                5000
            )
        )
        list.add(
            TicketModel(
                "https://www.eturbonews.com/wp-content/uploads/2018/09/snowboarding.jpg",
                "Экстремал",
                4.8f,
                "Прокат коньков, горнолыжных костюмов, снаряжения и аксессуаров",
                239,
                5000
            )
        )
        list.add(
            TicketModel(
                "https://www.eturbonews.com/wp-content/uploads/2018/09/snowboarding.jpg",
                "Экстремал",
                4.8f,
                "Прокат коньков, горнолыжных костюмов, снаряжения и аксессуаров",
                239,
                5000
            )
        )
        return list
    }
}
