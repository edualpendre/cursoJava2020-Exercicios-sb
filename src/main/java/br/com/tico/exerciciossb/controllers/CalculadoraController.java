package br.com.tico.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	// http://localhost:8080/calculadora/somar/50/30
	@GetMapping(path = "/somar/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

	// http://localhost:8080/calculadora/subtrair?a=100&b=20
	@GetMapping(path = "/subtrair")
	public int subtrair(@RequestParam(name = "a", defaultValue = "0") int a,
			@RequestParam(name = "b", defaultValue = "0") int b) {
		return a - b;
	}

}
