package com.avanade.rpg.service;

import com.avanade.rpg.model.Personagem;
import com.avanade.rpg.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PersonagemService {
    @Autowired
    private PersonagemRepository repository;

    public Personagem create(Personagem task){
        return this.repository.save(task);
    }

    public List<Personagem> findAll(){
        return repository.findAll();
    }

    public Personagem findById(Long id){
        return new Personagem();
    }

    public void delete(Long id){

    }

    public Personagem update(Personagem task){
        return new Personagem();
    }
}
