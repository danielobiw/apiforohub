package com.forohub.apiforohub.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        LocalDateTime fechaCreacion,
        Boolean estatus,
        @NotBlank
        String autor,
        @NotNull
        Curso curso
) {
}
