package com.practicum.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ToDoListAdapter (private val toDoItems: MutableList<ToDoItem>)  : RecyclerView.Adapter<ToDoListAdapter.ToDoViewHolder>() {

    class ToDoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val doneCheckBox: CheckBox = itemView.findViewById(R.id.done_checkbox)
        val toDoText: TextView = itemView.findViewById(R.id.todo_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.todo_item, parent, false)
        return ToDoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.doneCheckBox.setChecked(toDoItems[position].getDoneItem())
        holder.toDoText.text = toDoItems[position].toString()
    }

    override fun getItemCount(): Int {
        return toDoItems.size
    }
}