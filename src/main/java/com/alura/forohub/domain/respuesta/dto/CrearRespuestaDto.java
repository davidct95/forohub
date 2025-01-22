package com.alura.forohub.domain.respuesta.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CrearRespuestaDto(
        @NotBlank String mensaje,
        @NotNull Long usuarioId,
        @NotNull long topicoId
) {
}
