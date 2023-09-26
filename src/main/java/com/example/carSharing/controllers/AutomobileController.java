package com.example.carSharing.controllers;

import com.example.carSharing.Entities.Automobile;
import com.example.carSharing.Entities.Utente;
import com.example.carSharing.repositories.AutomobileRepo;
import com.example.carSharing.repositories.UtenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/automobile")
public class AutomobileController {
    @Autowired
    private AutomobileRepo automobileRepo;

    @PostMapping("/create")
    public void createAuto(@RequestBody Automobile automobile){
        automobileRepo.saveAndFlush(automobile);
    }

    @GetMapping("/get")
    public Automobile getAuto(@RequestParam long id) {
        Optional<Automobile> optionalAutomobile = automobileRepo.findById(id);
        if (optionalAutomobile.isEmpty()) throw new IllegalArgumentException("l'auto non esiste!");
        return optionalAutomobile.get();
    }

    @DeleteMapping("/delete")
    public void deleteAuto(@RequestParam long id){
        automobileRepo.deleteById(id);
    }

    @PutMapping("/update")
    public void updateAuto(@RequestParam Automobile automobile){

    }
}
