package com.taskmanager.observer;

import com.taskmanager.model.Task;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject do padrão Observer - Gerencia observers e notifica sobre eventos
 */
@Component
public class TaskSubject {

    private final List<TaskObserver> observers = new ArrayList<>();

    public void attach(TaskObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void detach(TaskObserver observer) {
        observers.remove(observer);
    }

    public void notifyTaskCreated(Task task) {
        for (TaskObserver observer : observers) {
            observer.onTaskCreated(task);
        }
    }

    public void notifyTaskUpdated(Task task) {
        for (TaskObserver observer : observers) {
            observer.onTaskUpdated(task);
        }
    }

    public void notifyTaskDeleted(Long taskId) {
        for (TaskObserver observer : observers) {
            observer.onTaskDeleted(taskId);
        }
    }

    public void notifyTaskStatusChanged(Task task, String oldStatus, String newStatus) {
        for (TaskObserver observer : observers) {
            observer.onTaskStatusChanged(task, oldStatus, newStatus);
        }
    }
}