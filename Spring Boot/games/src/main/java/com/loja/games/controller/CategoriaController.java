package com.loja.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.games.model.Categoria;
import com.loja.games.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repositoryC;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAllCategoria (){
		return ResponseEntity.status(200).body(repositoryC.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity <Categoria> findByIdCategoria (@PathVariable long id){
		return repositoryC.findById(id).map(ret -> ResponseEntity.status(200).body(ret))
				.orElse(ResponseEntity.status(200).build());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity <Categoria> findByDescricaoCategoria (@PathVariable String descricao){
		return repositoryC.findByDescricaoCategoria(descricao).map(ret -> ResponseEntity.status(200).body(ret))
				.orElse(ResponseEntity.status(200).build());
	}
	
	@PostMapping
	public ResponseEntity <Categoria> postCategoria (@RequestBody Categoria categoria){
		return ResponseEntity.status(201).body(repositoryC.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity <Categoria> putCategoria (@RequestBody Categoria categoria){
		return ResponseEntity.status(201).body(repositoryC.save(categoria));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Categoria> deleteCategoria (@PathVariable long id) {
		repositoryC.deleteById(id);
		return ResponseEntity.status(200).build();
	}
}
