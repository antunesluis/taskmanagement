package com.taskmanager.factory;

import com.taskmanager.model.Task;
import com.taskmanager.model.enums.Priority;
import com.taskmanager.model.enums.TaskStatus;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Padrão Factory Method - Criação de diferentes tipos de tarefas
 * Facilita a criação de tarefas com configurações específicas
 */
@Component
public class TaskFactory {

    public Task createSimpleTask(String title, String description) {
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setStatus(TaskStatus.PENDING);
        task.setPriority(Priority.MEDIUM);
        return task;
    }

    public Task createUrgentTask(String title, String description, LocalDateTime dueDate) {
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setStatus(TaskStatus.PENDING);
        task.setPriority(Priority.URGENT);
        task.setDueDate(dueDate);
        return task;
    }

    public Task createLowPriorityTask(String title, String description) {
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setStatus(TaskStatus.PENDING);
        task.setPriority(Priority.LOW);
        return task;
    }

    public Task createTaskWithPriority(String title, String description, Priority priority, LocalDateTime dueDate) {
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setStatus(TaskStatus.PENDING);
        task.setPriority(priority);
        task.setDueDate(dueDate);
        return task;
    }
}