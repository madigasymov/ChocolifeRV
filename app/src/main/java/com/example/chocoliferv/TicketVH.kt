package com.example.chocoliferv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.vh_ticket.view.*

class TicketVH(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.vh_ticket, parent, false)
) {
    fun bind(model: TicketModel) {
        itemView.apply {
            Glide.with(this).load(model.ticketBg).into(iv_ticket_bg)
            title.text = model.title
            rating.text = model.rating.toString()
            description.text = model.desc
            soldCount.text = model.count.toString()
            price.text = String.format("от %d тг", model.price)
        }
    }
}