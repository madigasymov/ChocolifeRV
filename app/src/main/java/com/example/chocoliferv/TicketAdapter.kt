package com.example.chocoliferv

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TicketAdapter(
    private val ticketModels: List<TicketModel>
) : RecyclerView.Adapter<TicketVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TicketVH {
        return TicketVH(parent)
    }

    override fun getItemCount() = ticketModels.size

    override fun onBindViewHolder(holder: TicketVH, position: Int) {
        holder.bind(ticketModels[position])
    }

}