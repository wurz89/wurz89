package it.web.zanzaraOrm.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.web.zanzaraOrm.entity.Cliente;
import it.web.zanzaraOrm.repository.ClienteRepository;

@Service
public class ClienteDao {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	
	public Cliente getcliente(String nome) {
		
	return	clienteRepository.findByNome(nome);
	
	
	}

}
