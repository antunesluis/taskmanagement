package com.taskmanager.config;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 * Inicializa configurações da aplicação na inicialização
 */
@Component
public class AppInitializer {

    @PostConstruct
    public void init() {

        // Carrega configurações do Singleton
        AppConfig config = AppConfig.getInstance();
        System.out.println("==============================================");
        System.out.println("Iniciando: " + config.getAppName() + " v" + config.getVersion());
        System.out.println("Notificações: " + (config.isNotificationsEnabled() ? "Ativadas" : "Desativadas"));
        System.out.println("==============================================");
    }
}