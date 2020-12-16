package br.com.tico.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tico.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente () {
		return new Cliente(28, "Pedro", "123.456.789-00");
	}
	
	//  para passar parâmetros direto na url. Exemplo: "http://localhost:8080/clientes/35421"
	@GetMapping("/{id}")
	public Cliente obterClientePorId1 (@PathVariable int id) {
		return new Cliente(id, "Maria", "987.454.545-01");
	}
	
	//  para passar parâmetros direto na url. 
	// Exemplo: "http://localhost:8080/clientes?id=552"
	// Exemplo: "http://localhost:8080/clientes"   id assumindo o valor default = 1
	@GetMapping
	public Cliente obterClientePorId2 (@RequestParam(name = "id", defaultValue = "1")  int id) {
		return new Cliente(id, "Gabi", "545.874.875-44");
	}
	
}
