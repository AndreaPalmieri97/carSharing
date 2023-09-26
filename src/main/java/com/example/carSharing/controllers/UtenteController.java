package com.example.carSharing.controllers;

import com.example.carSharing.Entities.Utente;
import com.example.carSharing.repositories.UtenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/utente")
public class UtenteController {
    @Autowired
    private UtenteRepo utenteRepo;

    @PostMapping("/create")
    public void createUtente(@RequestBody Utente utente){
        utenteRepo.saveAndFlush(utente);
    }

    @GetMapping("/get")
    public Utente getUtente(@RequestParam long id) {
        Optional<Utente> optionalUtente = utenteRepo.findById(id);
        if (optionalUtente.isEmpty()) throw new IllegalArgumentException("l'utente non esiste!");
        return optionalUtente.get();
    }

    @DeleteMapping("/delete")
    public void deleteUtente(@RequestParam long id){
        utenteRepo.deleteById(id);
    }

    @PutMapping("/update")
    public void updateUtente(@RequestParam Utente utente){

    }



}
