package com.taskmanager.model.enums;

public enum TaskStatus {
    PENDING("Pendente"),
    IN_PROGRESS("Em Progresso"),
    COMPLETED("Concluída"),
    CANCELLED("Cancelada");

    private final String description;

    TaskStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}