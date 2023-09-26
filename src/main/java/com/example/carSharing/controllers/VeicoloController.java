package com.example.carSharing.controllers;

import com.example.carSharing.Entities.Utente;
import com.example.carSharing.Entities.Veicolo;
import com.example.carSharing.repositories.UtenteRepo;
import com.example.carSharing.repositories.VeicoloRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/veicolo")
public class VeicoloController {
    @Autowired
    private VeicoloRepo veicoloRepo;

    @PostMapping("/create")
    public void createVeicolo(@RequestBody Veicolo veicolo){
        veicoloRepo.saveAndFlush(veicolo);
    }

    @GetMapping("/get")
    public Veicolo getVeicolo(@RequestParam long id) {
        Optional<Veicolo> optionalVeicolo = veicoloRepo.findById(id);
        if (optionalVeicolo.isEmpty()) throw new IllegalArgumentException("il veicolo non esiste!");
        return optionalVeicolo.get();
    }

    @DeleteMapping("/delete")
    public void deleteVeicolo(@RequestParam long id){
        veicoloRepo.deleteById(id);
    }

    @PutMapping("/update")
    public void updateVeicolo(@RequestParam Veicolo veicolo){

    }
}
