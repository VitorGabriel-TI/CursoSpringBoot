package com.projetospring.dslist.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.projetospring.dslist.dto.GameListDTO;
import com.projetospring.dslist.services.GameListService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    
    @Autowired
	private GameListService gameListService;

    @GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
}
