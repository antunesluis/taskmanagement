package com.taskmanager.config;

/**
 * Padrão Singleton - Garante única instância de configuração da aplicação
 * Thread-safe usando inicialização eager
 */
public class AppConfig {

    private static final AppConfig INSTANCE = new AppConfig();

    private String appName = "Task Manager API";
    private String version = "1.0.0";
    private int maxTasksPerProject = 100;
    private int maxCommentsPerTask = 50;
    private boolean notificationsEnabled = true;

    private AppConfig() {
        // Construtor privado para evitar instanciação externa
    }

    public static AppConfig getInstance() {
        return INSTANCE;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getMaxTasksPerProject() {
        return maxTasksPerProject;
    }

    public void setMaxTasksPerProject(int maxTasksPerProject) {
        this.maxTasksPerProject = maxTasksPerProject;
    }

    public int getMaxCommentsPerTask() {
        return maxCommentsPerTask;
    }

    public void setMaxCommentsPerTask(int maxCommentsPerTask) {
        this.maxCommentsPerTask = maxCommentsPerTask;
    }

    public boolean isNotificationsEnabled() {
        return notificationsEnabled;
    }

    public void setNotificationsEnabled(boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }
}