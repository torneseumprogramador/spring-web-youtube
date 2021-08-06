package com.web.tornese.SpringWeb.repositorio;

import com.web.tornese.SpringWeb.models.Administrador;

import org.springframework.data.repository.CrudRepository;

public interface AdministradoresRepo extends CrudRepository<Administrador, Integer> {
  
}
