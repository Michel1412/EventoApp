package com.eventApp.eventApp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.eventApp.eventApp.models.Evento;
import org.springframework.web.bind.annotation.PathVariable;

public interface EventoRepository extends CrudRepository<Evento, String > {

    Evento findByCodigo(long codigo);

}
