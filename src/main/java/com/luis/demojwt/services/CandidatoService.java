package com.luis.demojwt.services;

import java.util.ArrayList;
import java.util.Optional; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.demojwt.models.CandidatoModel;

import com.luis.demojwt.repositories.CandidatoRepository;


@Service
public class CandidatoService {
    @Autowired
    CandidatoRepository candidatoRepository;
    
    public ArrayList<CandidatoModel> obtenerCandidatos(){
        return (ArrayList<CandidatoModel>) candidatoRepository.findAll();
    }

    public CandidatoModel guardarCandidato(CandidatoModel usuario){
        return candidatoRepository.save(usuario);
    }

    public Optional<CandidatoModel> obtenerPorId(Long id){
        return candidatoRepository.findById(id);
    }


    public boolean eliminarCandidato(Long id) {
        try{
        	candidatoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


    
}