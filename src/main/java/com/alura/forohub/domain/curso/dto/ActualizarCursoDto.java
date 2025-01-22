package com.alura.forohub.domain.curso.dto;

import com.alura.forohub.domain.curso.Categoria;

public record ActualizarCursoDto(
        String name,
        Categoria categoria,
        Boolean activo
) {
}
