package com.taskmanager.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {

    private Long id;

    @NotBlank(message = "Conteúdo do comentário é obrigatório")
    private String content;

    @NotBlank(message = "Autor é obrigatório")
    private String author;

    private LocalDateTime createdAt;
    private Long taskId;
}