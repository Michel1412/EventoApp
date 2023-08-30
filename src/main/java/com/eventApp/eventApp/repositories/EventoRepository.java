package com.eventApp.eventApp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.eventApp.eventApp.models.Evento;
public interface EventoRepository extends CrudRepository<Evento, String > {


}
