package com.todolist.todolist.service;

import com.todolist.todolist.model.Task;
import com.todolist.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTask(){
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id){
        return taskRepository.findById(id);

    }

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public Task updateTask(long id, Task taskDetails){
        Optional<Task> optionalTask = taskRepository.findById(id);
        if (optionalTask.isPresent()){
            Task existingTask = optionalTask.get();
            existingTask.setTitle(taskDetails.getTitle());
            existingTask.setBody(taskDetails.getBody());
            existingTask.setCompleted(taskDetails.isCompleted());
            return taskRepository.save(existingTask);
        } else {
            throw new RuntimeException("Não foi encontrada nenhuma task com esse id" + id);

        }
    }
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }


}
