package br.com.bamt.uol.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
	
	@GetMapping("/")
	public String player() {
		return "Chegou aqui";
	}
	
	@PostMapping("/save")
	public Player save(@RequestBody @Valid PlayerDto playerDto) {
		Player player = playerDto.toPlayer();
		return player;
	}

}
