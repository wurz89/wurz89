package it.web.zanzaraOrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.web.zanzaraOrm.entity.Cliente;
import it.web.zanzaraOrm.repository.ClienteRepository;

@RestController
public class JsonController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/cliente")
	public Cliente getCliente(@RequestParam (name="input" ,required = false) String inputName ) {
		
		if(inputName==null || inputName=="") {
			return null;
		}
		
		
		Cliente c = clienteRepository.findByNome(inputName);
		return c;
	}

}
