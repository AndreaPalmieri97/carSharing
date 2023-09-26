package com.example.carSharing.controllers;

import com.example.carSharing.Entities.MonopattinoElettrico;
import com.example.carSharing.Entities.Utente;
import com.example.carSharing.repositories.MonopattinoElettricoRepo;
import com.example.carSharing.repositories.UtenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/monopattino")
public class MonopattinoElettricoController {
    @Autowired
    private MonopattinoElettricoRepo monopattinoElettricoRepo;

    @PostMapping("/create")
    public void createMonopattino(@RequestBody MonopattinoElettrico monopattinoElettrico){
        monopattinoElettricoRepo.saveAndFlush(monopattinoElettrico);
    }

    @GetMapping("/get")
    public MonopattinoElettrico getMonopattino(@RequestParam long id) {
        Optional<MonopattinoElettrico> optionalMonopattinoElettrico = monopattinoElettricoRepo.findById(id);
        if (optionalMonopattinoElettrico.isEmpty()) throw new IllegalArgumentException("il monopattino non esiste!");
        return optionalMonopattinoElettrico.get();
    }

    @DeleteMapping("/delete")
    public void deleteMonopattino(@RequestParam long id){
        monopattinoElettricoRepo.deleteById(id);
    }

    @PutMapping("/update")
    public void updateMonopattino(@RequestParam MonopattinoElettrico monopattinoElettrico){

    }
}
