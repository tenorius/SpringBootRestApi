package com.tenorius.restapi.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tenorius.restapi.entities.Contato;

@RepositoryRestResource
public interface ContatoRepository extends CrudRepository<Contato, Long>{

}
