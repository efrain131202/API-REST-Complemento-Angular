package com.character.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.character.service.CharacterService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CharacterController {

    @Autowired
    private CharacterService service;

    @GetMapping("/list/race/{race}/affiliation/{affiliation}")
    public ResponseEntity<String> getCharacterById(@PathVariable String race, @PathVariable String affiliation) {
        return service.getCharacters(race,affiliation);
    }
}