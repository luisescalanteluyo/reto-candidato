package com.luis.demojwt.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luis.demojwt.models.CandidatoModel;
 

@Repository
public interface CandidatoRepository extends CrudRepository<CandidatoModel, Long> {
	
   // public abstract ArrayList<CandidatoModel> findByPrioridad(Integer prioridad);

   // Optional<CandidatoModel> findOneByEmail(String email);
    
}