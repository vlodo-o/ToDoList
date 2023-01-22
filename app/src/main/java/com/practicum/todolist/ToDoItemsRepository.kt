package com.practicum.todolist

object ToDoItemsRepository {
    private val toDoList: MutableList<ToDoItem> = mutableListOf(ToDoItem("1", "Item1", true),
        ToDoItem("2", "Item2", false))

    fun addToDoItem(item: ToDoItem) {
        toDoList.add(item)
    }

    fun getList() = toDoList

}