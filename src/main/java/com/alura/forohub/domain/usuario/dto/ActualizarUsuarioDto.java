package com.alura.forohub.domain.usuario.dto;

import com.alura.forohub.domain.usuario.Role;

public record ActualizarUsuarioDto(
        String password,
        Role role,
        String nombre,
        String apellido,
        String email,
        Boolean enabled
) {
}
