package com.alura.forohub.domain.topico.dto;

import com.alura.forohub.domain.curso.Categoria;
import com.alura.forohub.domain.topico.Estado;
import com.alura.forohub.domain.topico.Topico;

import java.time.LocalDateTime;

public record DetallesTopicoDto(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        LocalDateTime ultimaActualizacion,
        Estado estado,
        String usuario,
        String curso,
        Categoria categoriaCurso
) {
    public DetallesTopicoDto(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getUltimaActualizacion(),
                topico.getEstado(),
                topico.getUsuario().getUsername(),
                topico.getCurso().getName(),
                topico.getCurso().getCategoria()
        );
    }
}
