package Dashboard.de.eventos.dao;

import org.springframework.data.repository.CrudRepository;

import Dashboard.de.eventos.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{

	
	public Usuario findByEmailOrRacf(String email, String racf);
	
}
