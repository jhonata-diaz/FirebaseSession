package com.example.myapplication.prueva

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TaskRepository @Inject constructor() {
    private val tasks = mutableListOf<Task>()

    fun getTasks(): List<Task> = tasks

    fun addTask(task: Task) {
        tasks.add(task)
    }
}
