package com.todolist.todolist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "O titulo da tarefa não pode estar vazio")
    private String title;
    private String description;
    private String body;
    private boolean completed;
    private String itens;

    public Task(){

    }


    public Task(long id, String title, String body, boolean completed, String description, String itens) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.completed = completed;
        this.description =  description;
        this.itens = itens;

    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getItens(){
        return itens;
    }

    public void setItens(String itens){
        this.itens = itens;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
