package com.franquicia.msinventario.controller;

import com.franquicia.msinventario.entity.CorteCarne;
import com.franquicia.msinventario.repository.CorteCarneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventario") 
public class CorteCarneController {

    @Autowired
    private CorteCarneRepository repository; 

   
    @GetMapping
    public List<CorteCarne> obtenerInventario() {
        
        return repository.findAll(); 
    }

    
    @PostMapping
    public CorteCarne agregarCorte(@RequestBody CorteCarne nuevoCorte) {
       
        return repository.save(nuevoCorte);
    }
}
