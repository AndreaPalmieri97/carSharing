package com.example.carSharing.controllers;

import com.example.carSharing.Entities.Bicicletta;
import com.example.carSharing.Entities.Utente;
import com.example.carSharing.repositories.BiciclettaRepo;
import com.example.carSharing.repositories.UtenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/bicicletta")
public class BiciclettaController {
    @Autowired
    private BiciclettaRepo biciclettaRepo;

    @PostMapping("/create")
    public void createBicicletta(@RequestBody Bicicletta bicicletta){
        biciclettaRepo.saveAndFlush(bicicletta);
    }

    @GetMapping("/get")
    public Bicicletta getBicicletta(@RequestParam long id) {
        Optional<Bicicletta> optionalBicicletta = biciclettaRepo.findById(id);
        if (optionalBicicletta.isEmpty()) throw new IllegalArgumentException("la bicicletta non esiste!");
        return optionalBicicletta.get();
    }

    @DeleteMapping("/delete")
    public void deleteBicicletta(@RequestParam long id){
        biciclettaRepo.deleteById(id);
    }

    @PutMapping("/update")
    public void updateBicicletta(@RequestParam Bicicletta bicicletta){

    }
}
