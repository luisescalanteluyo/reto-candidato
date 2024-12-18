package com.luis.demojwt.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.luis.demojwt.models.CandidatoModel;
import com.luis.demojwt.services.CandidatoService;

import lombok.RequiredArgsConstructor;

@RestController 
@RequestMapping("/api/v1/candidato")
@RequiredArgsConstructor
public class CandidatoController {
	
    @Autowired
    CandidatoService candidatoService;

    
	    @GetMapping(value = "lista")
	    public ArrayList<CandidatoModel> obtenerCandidatos(){
	        return candidatoService.obtenerCandidatos();
	    }

	    @PostMapping(value = "save")
	    public ResponseEntity<Object> guardarCandidato(@RequestBody CandidatoModel candidato){
	    	if(candidato.getId()!=null) {
	    		//return new ResponseEntity<>(json,HttpStatus.OK); 
	    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	    	} 
	    	 
	    	return new ResponseEntity<>(this.candidatoService.guardarCandidato(candidato),HttpStatus.OK);
	    	
	        //return this.candidatoService.guardarCandidato(candidato);
	    }
	    
	    @PutMapping(value = "update")
	    public ResponseEntity<Object> actualizarCandidato(@RequestBody CandidatoModel candidato){
	    	if(candidato.getId()==null) { 
	    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	    	} 
	    	 
	    	return new ResponseEntity<>(this.candidatoService.guardarCandidato(candidato),HttpStatus.OK);
	    }
	    
	 
	    @DeleteMapping(path = "delete/{id}")
	    public String eliminarCandidato(@PathVariable("id") Long id){
	        boolean ok = this.candidatoService.eliminarCandidato(id);
	        if (ok){
	            return "Se eliminó el usuario con id " + id;
	        }else{
	            return "No pudo eliminar el usuario con id" + id;
	        }
	    }
}
