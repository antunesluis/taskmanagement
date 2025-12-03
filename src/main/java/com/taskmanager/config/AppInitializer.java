package com.taskmanager.config;

import com.taskmanager.observer.NotificationObserver;
import com.taskmanager.observer.TaskSubject;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Inicializa configurações da aplicação na inicialização
 */
@Component
public class AppInitializer {

    @Autowired
    private TaskSubject taskSubject;

    @Autowired
    private NotificationObserver notificationObserver;

    @PostConstruct
    public void init() {
        // Registra observers no subject
        taskSubject.attach(notificationObserver);

        // Carrega configurações do Singleton
        AppConfig config = AppConfig.getInstance();
        System.out.println("==============================================");
        System.out.println("Iniciando: " + config.getAppName() + " v" + config.getVersion());
        System.out.println("Notificações: " + (config.isNotificationsEnabled() ? "Ativadas" : "Desativadas"));
        System.out.println("==============================================");
    }
}