package com.taskmanager.builder;

import com.taskmanager.model.Project;
import com.taskmanager.model.Task;
import com.taskmanager.model.enums.Priority;
import com.taskmanager.model.enums.TaskStatus;

import java.time.LocalDateTime;

/**
 * Padrão Builder - Construção fluente de objetos Task complexos
 * Permite criar tarefas com diferentes combinações de atributos de forma legível
 */
public class TaskBuilder {

    private Task task;

    public TaskBuilder() {
        this.task = new Task();
        this.task.setStatus(TaskStatus.PENDING);
        this.task.setPriority(Priority.MEDIUM);
    }

    public TaskBuilder withTitle(String title) {
        task.setTitle(title);
        return this;
    }

    public TaskBuilder withDescription(String description) {
        task.setDescription(description);
        return this;
    }

    public TaskBuilder withStatus(TaskStatus status) {
        task.setStatus(status);
        return this;
    }

    public TaskBuilder withPriority(Priority priority) {
        task.setPriority(priority);
        return this;
    }

    public TaskBuilder withDueDate(LocalDateTime dueDate) {
        task.setDueDate(dueDate);
        return this;
    }

    public TaskBuilder withProject(Project project) {
        task.setProject(project);
        return this;
    }

    public Task build() {
        if (task.getTitle() == null || task.getTitle().isEmpty()) {
            throw new IllegalStateException("Task must have a title");
        }
        return task;
    }

    public static TaskBuilder builder() {
        return new TaskBuilder();
    }
}