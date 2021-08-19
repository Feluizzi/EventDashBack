package Dashboard.de.eventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Dashboard.de.eventos.dao.UsuarioDAO;
import Dashboard.de.eventos.model.Usuario;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioDAO dao;
	
	@PostMapping("/login")
public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario dadosLogin) {
		
		Usuario res = dao.findByEmailOrRacf(dadosLogin.getEmail(), dadosLogin.getRacf());
		if (res != null) { // encontrei o usuário no banco
			if (res.getSenha().equals(dadosLogin.getSenha())) { // verifico se a senha bate
				return ResponseEntity.ok(res);
			}
		}
		return ResponseEntity.status(403).build(); 
	}
	

}