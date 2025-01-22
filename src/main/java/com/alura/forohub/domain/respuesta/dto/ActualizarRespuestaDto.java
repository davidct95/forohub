package com.alura.forohub.domain.respuesta.dto;

public record ActualizarRespuestaDto(
        String mensaje,
        Boolean solucion,
        Boolean borrado
) {
}
