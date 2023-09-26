package com.example.carSharing.controllers;

import com.example.carSharing.Entities.Noleggio;
import com.example.carSharing.Entities.Utente;
import com.example.carSharing.repositories.NoleggioRepo;
import com.example.carSharing.repositories.UtenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/noleggio")
public class NoleggioController {
    @Autowired
    private NoleggioRepo noleggioRepo;

    @PostMapping("/create")
    public void createNoleggio(@RequestBody Noleggio noleggio){
        noleggioRepo.saveAndFlush(noleggio);
    }

    @GetMapping("/get")
    public Noleggio getNoleggio(@RequestParam long id) {
        Optional<Noleggio> optionalNoleggio = noleggioRepo.findById(id);
        if (optionalNoleggio.isEmpty()) throw new IllegalArgumentException("il noleggio non esiste!");
        return optionalNoleggio.get();
    }

    @DeleteMapping("/delete")
    public void deleteNoleggio(@RequestParam long id){
        noleggioRepo.deleteById(id);
    }

    @PutMapping("/update")
    public void updateNoleggio(@RequestParam Noleggio noleggio){

    }
}
