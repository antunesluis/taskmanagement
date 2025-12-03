package com.taskmanager.observer;

import com.taskmanager.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Implementação do Observer que envia notificações
 */
@Component
public class NotificationObserver implements TaskObserver {

    private static final Logger logger = LoggerFactory.getLogger(NotificationObserver.class);

    @Override
    public void onTaskCreated(Task task) {
        logger.info("Notificação: Nova tarefa criada - {}", task.getTitle());
        // Aqui poderia enviar email, SMS, push notification, etc.
    }

    @Override
    public void onTaskUpdated(Task task) {
        logger.info("Notificação: Tarefa atualizada - {}", task.getTitle());
    }

    @Override
    public void onTaskDeleted(Long taskId) {
        logger.info("Notificação: Tarefa {} foi deletada", taskId);
    }

    @Override
    public void onTaskStatusChanged(Task task, String oldStatus, String newStatus) {
        logger.info("Notificação: Status da tarefa '{}' mudou de {} para {}",
                task.getTitle(), oldStatus, newStatus);
    }
}