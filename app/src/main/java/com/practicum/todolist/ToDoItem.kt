package com.practicum.todolist

data class ToDoItem(val id: String, val text: String, val done: Boolean) {
    override fun toString() = text
    fun getDoneItem() = done
}
