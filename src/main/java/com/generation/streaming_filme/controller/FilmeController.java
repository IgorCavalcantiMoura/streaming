package com.generation.streaming_filme.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


import com.generation.streaming_filme.model.Filme;
import com.generation.streaming_filme.repository.CategoriaRepository;
import com.generation.streaming_filme.repository.FilmeRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/filmes")
@CrossOrigin(origins="*", allowedHeaders = "*")
public class FilmeController {

	@Autowired
	private FilmeRepository filmeRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping()
	public ResponseEntity<List<Filme>> getAll(){
		return ResponseEntity.ok(filmeRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Filme> getById(@PathVariable Long id){
		return filmeRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@GetMapping("/nome/{nomeFilme}")
	public ResponseEntity<List<Filme>> getByTitulo(@PathVariable String nomeFilme){
		return ResponseEntity.ok(filmeRepository.findAllByNomeFilmeContainingIgnoreCase(nomeFilme));
	}
	
	@PostMapping
	public ResponseEntity<Filme> post(@Valid @RequestBody Filme filme){
		if(categoriaRepository.existsById(filme.getCategoria().getId()))
			return ResponseEntity.status(HttpStatus.CREATED)
				.body(filmeRepository.save(filme));
		
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Categoria não existe!", null);
	}
	
	@PutMapping
	private ResponseEntity<Filme> put(@Valid @RequestBody Filme filme){
		if(filmeRepository.existsById(filme.getId())) {
			
			if(categoriaRepository.existsById(filme.getCategoria().getId()))
				return ResponseEntity.status(HttpStatus.OK).body(filmeRepository.save(filme));
			
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Categoria não existe!", null);
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	private void delete(@PathVariable Long id) {
		Optional<Filme> produto = filmeRepository.findById(id);
		
		if(produto.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
		filmeRepository.deleteById(id);
	}
}
