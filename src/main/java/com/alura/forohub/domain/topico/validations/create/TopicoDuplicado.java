package com.alura.forohub.domain.topico.validations.create;

import com.alura.forohub.domain.topico.dto.CrearTopicoDto;
import com.alura.forohub.domain.topico.repository.TopicoRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicoDuplicado implements ValidarTopicoCreado{
    @Autowired
    private TopicoRepository topicoRepository;


    @Override
    public void validate(CrearTopicoDto data) {
        var topicoDuplicado = topicoRepository.existsByTituloAndMensaje(data.titulo(), data.mensaje());
        if(topicoDuplicado){
            throw new ValidationException("Este topico ya existe. Revisa /topicos/" + topicoRepository.findByTitulo(data.titulo()).getId());

        }
    }
}
