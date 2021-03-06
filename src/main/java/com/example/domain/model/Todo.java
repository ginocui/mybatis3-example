package com.example.domain.model;

import org.springframework.data.domain.Auditable;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by shimizukazuki on 2014/10/08.
 */
public class Todo extends AbstractEntity<String> {

    private String todoId;
    private String title;
    private boolean finished;
    private Date createdAt;

    public String getTodoId() {
        return todoId;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String getId() {
        return getTodoId();
    }

}
