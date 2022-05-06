package it.web.zanzaraOrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.web.zanzaraOrm.Dao.ClienteDao;
import it.web.zanzaraOrm.entity.Cliente;
import it.web.zanzaraOrm.repository.ClienteRepository;

@Controller
public class IndexController {
	
//	@Autowired
//	private ClienteRepository clienteRepository;
	@Autowired
	private ClienteDao clienteDao;
	
	

	
	@GetMapping("/benvenuto")
	public String getbenvenuto() {
		
		return "welcome";
	}
	
	
	@GetMapping("/save")
	@ResponseBody
	public String salvaCliente() {
		
//		Cliente c = new Cliente();
//		c.setCognome("Romano");
//		clienteRepository.save(c);
//		return "controllare il db, dovrei aver salvato l'utente con cognome Romano";
		return null;
	}
	
	
	@GetMapping("/test")
	@ResponseBody
	public Cliente getCliente() {
//		Cliente c = clienteRepository.findById(2);
		return null;
	}
	
	@GetMapping("/dao")
	@ResponseBody
	public String getClienteDao() {
		Cliente c = clienteDao.getcliente("Harry");
		
		return c.getCognome();
	}
	
	
	
	
	
	
	
}
