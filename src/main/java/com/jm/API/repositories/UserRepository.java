package com.jm.API.repositories;

import com.jm.API.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*
* Esta interfaz es implementada automaticamente en tiempo de
* ejecución y la anotación consume la implementación resultante
* para implementar los end-points del API.
* */
@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {
}
