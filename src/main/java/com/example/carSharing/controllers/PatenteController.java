package com.example.carSharing.controllers;

import com.example.carSharing.Entities.Patente;
import com.example.carSharing.Entities.Utente;
import com.example.carSharing.repositories.PatenteRepo;
import com.example.carSharing.repositories.UtenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/patente")
public class PatenteController {
    @Autowired
    private PatenteRepo patenteRepo;

    @PostMapping("/create")
    public void createPatente(@RequestBody Patente patente){
        patenteRepo.saveAndFlush(patente);
    }

    @GetMapping("/get")
    public Patente getPatente(@RequestParam long id) {
        Optional<Patente> optionalPatente = patenteRepo.findById(id);
        if (optionalPatente.isEmpty()) throw new IllegalArgumentException("la patente non esiste!");
        return optionalPatente.get();
    }

    @DeleteMapping("/delete")
    public void deletePatente(@RequestParam long id){
        patenteRepo.deleteById(id);
    }

    @PutMapping("/update")
    public void updatePatente(@RequestParam Patente patente){

    }
}
