package com.character.service;

import org.springframework.http.ResponseEntity;


public interface CharacterService {

 public	ResponseEntity<String> getCharacters(String race, String affiliation);
}
