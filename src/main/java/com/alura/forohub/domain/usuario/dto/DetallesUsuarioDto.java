package com.alura.forohub.domain.usuario.dto;

import com.alura.forohub.domain.usuario.Role;
import com.alura.forohub.domain.usuario.Usuario;

public record DetallesUsuarioDto(
        Long id,
        String username,
        Role role,
        String nombre,
        String apellido,
        String email,
        Boolean enabled
) {
    public DetallesUsuarioDto(Usuario usuario){
        this(usuario.getId(),
                usuario.getUsername(),
                usuario.getRole(),
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getEmail(),
                usuario.getEnabled()
        );
    }
}
