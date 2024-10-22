package com.character.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CharacterServiceImpl implements CharacterService {

	@Autowired
	private RestTemplate clienteRest;

	@Override
	public ResponseEntity<String> getCharacters(String race, String affiliation){
		String url = "https://dragonball-api.com/api/characters?race={race}&affiliation={affiliation}";
		return clienteRest.getForEntity(url, String.class,race,affiliation);
	}
}
