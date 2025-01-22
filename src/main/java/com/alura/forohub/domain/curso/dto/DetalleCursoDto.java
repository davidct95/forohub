package com.alura.forohub.domain.curso.dto;

import com.alura.forohub.domain.curso.Categoria;
import com.alura.forohub.domain.curso.Curso;

public record DetalleCursoDto(
        Long id,
        String name,
        Categoria categoria,
        Boolean activo
) {
    public DetalleCursoDto(Curso curso){
        this(
                curso.getId(),
                curso.getName(),
                curso.getCategoria(),
                curso.getActivo());
    }
}
