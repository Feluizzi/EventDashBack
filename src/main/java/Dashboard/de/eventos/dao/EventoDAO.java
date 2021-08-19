package Dashboard.de.eventos.dao;

import org.springframework.data.repository.CrudRepository;

import Dashboard.de.eventos.model.Evento;

public interface EventoDAO extends CrudRepository<Evento, Integer> {

}
