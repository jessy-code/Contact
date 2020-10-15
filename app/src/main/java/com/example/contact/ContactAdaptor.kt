package com.example.contact

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_contact.view.*


class ContactAdaptor (private val movies: List<Contact>) : RecyclerView.Adapter<ContactAdaptor.ContactViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ContactViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount() = movies.size

    inner class ContactViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(R.layout.item_contact, parent, false)){

        fun bind(contact: Contact){

            itemView.run {
                if (!contact.isValid) textView.alpha = 0.5F
                textView.text = contact.name + " " + contact.age.toString() + " " + contact.photo

            }

        }

    }
}