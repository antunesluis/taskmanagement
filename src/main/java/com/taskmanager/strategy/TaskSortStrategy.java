package com.taskmanager.strategy;

import com.taskmanager.model.Task;

import java.util.Comparator;
import java.util.List;

/**
 * Padrão Strategy - Define diferentes estratégias de ordenação de tarefas
 */
public interface TaskSortStrategy {
    List<Task> sort(List<Task> tasks);
}

class SortByPriority implements TaskSortStrategy {
    @Override
    public List<Task> sort(List<Task> tasks) {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getPriority).reversed())
                .toList();
    }
}

class SortByDueDate implements TaskSortStrategy {
    @Override
    public List<Task> sort(List<Task> tasks) {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getDueDate,
                        Comparator.nullsLast(Comparator.naturalOrder())))
                .toList();
    }
}

class SortByCreationDate implements TaskSortStrategy {
    @Override
    public List<Task> sort(List<Task> tasks) {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getCreatedAt).reversed())
                .toList();
    }
}

class SortByStatus implements TaskSortStrategy {
    @Override
    public List<Task> sort(List<Task> tasks) {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getStatus))
                .toList();
    }
}