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

import com.loja.games.model.Produto;
import com.loja.games.repository.ProdutoRepository;

@RestController
@RequestMapping ("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repositoryP;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAllProduto (){
		return ResponseEntity.status(200).body(repositoryP.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity <Produto> findByIdProduto (@PathVariable long id){
		return repositoryP.findById(id).map(ret -> ResponseEntity.status(200).body(ret))
				.orElse(ResponseEntity.status(200).build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity <Produto> findByTitulo (@PathVariable String titulo){
		return repositoryP.findByTitulo(titulo).map(ret -> ResponseEntity.status(200).body(ret))
				.orElse(ResponseEntity.status(200).build());
	}
	
	@PostMapping
	public ResponseEntity <Produto> postProduto (@RequestBody Produto produto){
		return ResponseEntity.status(201).body(repositoryP.save(produto));
	}
	
	@PutMapping
	public ResponseEntity <Produto> putProduto (@RequestBody Produto produto){
		return ResponseEntity.status(201).body(repositoryP.save(produto));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Produto> deleteProduto (@PathVariable long id) {
		repositoryP.deleteById(id);
		return ResponseEntity.status(200).build();
	}
	
}
