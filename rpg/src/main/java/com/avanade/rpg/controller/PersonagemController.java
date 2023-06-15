package com.avanade.rpg.controller;

import com.avanade.rpg.model.Personagem;
import com.avanade.rpg.service.PersonagemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/rpg")
@Api( value = "RPG API REST")
@CrossOrigin(origins = "*")
public class PersonagemController {

    @Autowired
    private PersonagemService service;

    @GetMapping("/personagens")
    @ApiOperation("Lista de todos os personagens")
    public ResponseEntity<List<Personagem>> getAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @PostMapping("/personagens")
    @ApiOperation("Cria um novo personagem")
    public ResponseEntity<Personagem> create(@RequestBody Personagem personagem){
        return new ResponseEntity<Personagem>(service.create(personagem), HttpStatus.CREATED);
    }
}
