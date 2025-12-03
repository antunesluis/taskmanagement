package com.taskmanager.observer;

import com.taskmanager.model.Task;

/**
 * Padrão Observer - Interface para observadores de eventos de tarefas
 */
public interface TaskObserver {
    void onTaskCreated(Task task);
    void onTaskUpdated(Task task);
    void onTaskDeleted(Long taskId);
    void onTaskStatusChanged(Task task, String oldStatus, String newStatus);
}