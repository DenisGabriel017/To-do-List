package com.todolist.todolist.repository;

import com.todolist.todolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByCompleted(boolean completed);
    List<Task> findByTitleContainingAndCompleted(String title, boolean completed);
    List<Task> findByTitleContaining(String title);
    List<Task> countByCompleted(boolean completed);

}
