package it.web.zanzaraOrm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.web.zanzaraOrm.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

	public Cliente findById(int id);
	public Cliente findByNome(String s);
	

}
