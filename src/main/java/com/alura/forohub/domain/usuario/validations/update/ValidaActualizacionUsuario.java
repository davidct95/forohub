package com.alura.forohub.domain.usuario.validations.update;

import com.alura.forohub.domain.usuario.dto.ActualizarUsuarioDto;
import com.alura.forohub.domain.usuario.repository.UsuarioRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidaActualizacionUsuario implements ValidarActualizarUsuario{
    @Autowired
    private UsuarioRepository repository;

    @Override
    public void validate(ActualizarUsuarioDto data) {
        if(data.email() != null){
            var emailDuplicado = repository.findByEmail(data.email());
            if(emailDuplicado != null){
                throw new ValidationException("Este email ya esta en uso");
            }
        }
    }
}
