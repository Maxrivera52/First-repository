package com.idat.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.modelo.Aula;

@Repository
public interface IAula extends CrudRepository<Aula, String>{

}
