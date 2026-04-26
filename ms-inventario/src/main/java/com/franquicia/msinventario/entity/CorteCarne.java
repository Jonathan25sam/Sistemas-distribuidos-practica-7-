package com.franquicia.msinventario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cortes_carne") 
public class CorteCarne {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    private String nombreCorte; 
    private Double kilosDisponibles;
    private Double precioPorKilo;

    
    public CorteCarne() {
    }

    public CorteCarne(String nombreCorte, Double kilosDisponibles, Double precioPorKilo) {
        this.nombreCorte = nombreCorte;
        this.kilosDisponibles = kilosDisponibles;
        this.precioPorKilo = precioPorKilo;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombreCorte() { return nombreCorte; }
    public void setNombreCorte(String nombreCorte) { this.nombreCorte = nombreCorte; }

    public Double getKilosDisponibles() { return kilosDisponibles; }
    public void setKilosDisponibles(Double kilosDisponibles) { this.kilosDisponibles = kilosDisponibles; }

    public Double getPrecioPorKilo() { return precioPorKilo; }
    public void setPrecioPorKilo(Double precioPorKilo) { this.precioPorKilo = precioPorKilo; }
}
