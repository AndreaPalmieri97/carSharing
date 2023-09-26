package com.example.carSharing.controllers;

import com.example.carSharing.Entities.Moto;
import com.example.carSharing.Entities.Utente;
import com.example.carSharing.repositories.MotoRepo;
import com.example.carSharing.repositories.UtenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/moto")
public class MotoController {
    @Autowired
    private MotoRepo motoRepo;

    @PostMapping("/create")
    public void createMoto(@RequestBody Moto moto){
        motoRepo.saveAndFlush(moto);
    }

    @GetMapping("/get")
    public Moto getMoto(@RequestParam long id) {
        Optional<Moto> optionalMoto = motoRepo.findById(id);
        if (optionalMoto.isEmpty()) throw new IllegalArgumentException("la moto non esiste!");
        return optionalMoto.get();
    }

    @DeleteMapping("/delete")
    public void deleteMoto(@RequestParam long id){
        motoRepo.deleteById(id);
    }

    @PutMapping("/update")
    public void updateMoto(@RequestParam Moto moto){

    }
}
