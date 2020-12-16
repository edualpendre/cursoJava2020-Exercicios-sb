package br.com.tico.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.tico.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
	

}
