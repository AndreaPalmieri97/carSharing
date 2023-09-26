package com.example.carSharing.controllers;

import com.example.carSharing.Entities.Furgoncino;
import com.example.carSharing.Entities.Utente;
import com.example.carSharing.repositories.FurgoncinoRepo;
import com.example.carSharing.repositories.UtenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/furgoncino")
public class FurgoncinoController {
    @Autowired
    private FurgoncinoRepo furgoncinoRepo;

    @PostMapping("/create")
    public void createFurgone(@RequestBody Furgoncino furgoncino){
        furgoncinoRepo.saveAndFlush(furgoncino);
    }

    @GetMapping("/get")
    public Furgoncino getFurgone(@RequestParam long id) {
        Optional<Furgoncino> optionalFurgoncino = furgoncinoRepo.findById(id);
        if (optionalFurgoncino.isEmpty()) throw new IllegalArgumentException("il furgoncino non esiste!");
        return optionalFurgoncino.get();
    }

    @DeleteMapping("/delete")
    public void deleteFurgone(@RequestParam long id){
        furgoncinoRepo.deleteById(id);
    }

    @PutMapping("/update")
    public void updateFurgone(@RequestParam Furgoncino furgoncino){

    }
}
