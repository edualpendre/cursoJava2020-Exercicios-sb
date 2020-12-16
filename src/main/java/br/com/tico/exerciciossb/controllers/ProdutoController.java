package br.com.tico.exerciciossb.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tico.exerciciossb.model.entities.Produto;
import br.com.tico.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	// @Autowired automaticamente o spring vai ser o responsável pro criar um objeto
	// ProdutoRepository
	@Autowired
	private ProdutoRepository produtoRepository;

	// @PostMapping esse método será chamado sempre que for feita uma requisição do
	// tipo POST
	// @ResponseBody (opcional) somente para ficar claro que o "Produto/parâmetros"
	// está no corpo da mensagem (body)

//	@PostMapping
//	public @ResponseBody Produto novoProduto(@RequestParam String nome, double preco, double desconto) {
////		Produto produto = new Produto();    // opção sem o construtor "public Produto(String nome) {....." na classe Produto
////		produto.setNome(nome);              // opção sem o construtor "public Produto(String nome) {....." na classe Produto
//		if (preco > 0 && (desconto >= 0 && desconto <= 1)) {
//			Produto produto = new Produto(nome, preco, desconto);
//			produtoRepository.save(produto);
//			return produto;
//		} else {
//			return null;
//		}
//
//	}

	@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;

	}

}
