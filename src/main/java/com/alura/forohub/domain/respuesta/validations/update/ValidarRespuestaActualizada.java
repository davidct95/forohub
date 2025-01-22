package com.alura.forohub.domain.respuesta.validations.update;

import com.alura.forohub.domain.respuesta.dto.ActualizarRespuestaDto;

public interface ValidarRespuestaActualizada {
    void validate(ActualizarRespuestaDto data, Long respuestaId);
}
