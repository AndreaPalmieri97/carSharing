package com.example.carSharing.controllers;

import com.example.carSharing.Entities.Utente;
import com.example.carSharing.repositories.UtenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utente")
public class UtenteController {
    @Autowired
    private UtenteRepo utenteRepo;

    @PostMapping("/create")
    public void createUtente(@RequestBody Utente utente){
        utenteRepo.saveAndFlush(utente);
    }

}
