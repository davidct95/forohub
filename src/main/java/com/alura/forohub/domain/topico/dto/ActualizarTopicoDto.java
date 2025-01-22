package com.alura.forohub.domain.topico.dto;

import com.alura.forohub.domain.topico.Estado;

public record ActualizarTopicoDto(
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
) {
}
