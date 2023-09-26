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
    public Utente getUtente(@PathVariable Long id_utente) {
        Optional<Utente> optionalUtente = utenteRepo.findById(id_utente);
        if (optionalUtente.isEmpty()) throw new IllegalArgumentException("l'utente non esiste!");
        return optionalUtente.get();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUtente(@PathVariable long id){
        utenteRepo.deleteById(id);
    }

}
