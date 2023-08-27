package com.projetospring.dslist.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.projetospring.dslist.entities.Game;
import com.projetospring.dslist.services.GameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    @Autowired
	private GameService gameService;

    @GetMapping
	public List<Game> findAll() {
		List<Game> result = gameService.findAll();
		return result;
	}
}
