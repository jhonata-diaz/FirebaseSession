package com.example.myapplication.prueva

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TaskViewModel @Inject constructor(
    private val repository: TaskRepository
) : ViewModel() {

    private val _tasks = MutableStateFlow<List<Task>>(emptyList())
    val tasks: StateFlow<List<Task>> get() = _tasks

    fun loadTasks() {
        _tasks.value = repository.getTasks()
    }

    fun addTask(title: String) {
        val newTask = Task(id = _tasks.value.size + 1, title = title)
        repository.addTask(newTask)
        loadTasks()
    }
}
