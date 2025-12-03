package com.taskmanager.strategy;

import com.taskmanager.model.Task;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Contexto do padrão Strategy
 */
@Component
public class TaskSorter {

    private TaskSortStrategy strategy;

    public void setStrategy(TaskSortStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Task> sort(List<Task> tasks) {
        if (strategy == null) {
            return tasks;
        }
        return strategy
                .sort(tasks);
    }

    public List<Task> sortByPriority(List<Task> tasks) {
        setStrategy(new SortByPriority());
        return sort(tasks);
    }

    public List<Task> sortByDueDate(List<Task> tasks) {
        setStrategy(new SortByDueDate());
        return sort(tasks);
    }

    public List<Task> sortByCreationDate(List<Task> tasks) {
        setStrategy(new SortByCreationDate());
        return sort(tasks);
    }

    public List<Task> sortByStatus(List<Task> tasks) {
        setStrategy(new SortByStatus());
        return sort(tasks);
    }
}