package com.todolist.todolist.controller;

import com.todolist.todolist.model.Task;
import com.todolist.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(){
        List<Task> tasks = taskService.getAllTask();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id){
        Task task = taskService.getTaskById(id).orElseThrow(() -> new RuntimeException("Nenhuma tarefa foi encontrada com esse Id"));
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    @PostMapping("/createTask")
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        Task createdTask = taskService.createTask(task);
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("A task foi deletada com sucesso!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task updatedTask){
        Task existingTask = taskService.getTaskById(id).orElseThrow(()-> new RuntimeException("Não foi encontrada nenhuma task com esse id "+  id));

        existingTask.setTitle(updatedTask.getTitle());
        existingTask.setBody(updatedTask.getBody());
        existingTask.setDescription(updatedTask.getDescription());
        existingTask.setItens(updatedTask.getItens());
        existingTask.setCompleted(updatedTask.isCompleted());

        Task savedTask = taskService.updateTask(id, existingTask);
        return ResponseEntity.ok(savedTask);
    }





}
