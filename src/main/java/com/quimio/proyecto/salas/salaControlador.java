package com.quimio.proyecto.salas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/salas")
public class salaControlador {

    @Autowired
    private salaService salaService;

    @PostMapping("")
    public ResponseEntity<sala> addSala(@RequestBody sala sala) {
        sala s = salaService.saveOrUpdateSala(sala);
        return new ResponseEntity<sala>(s, HttpStatus.CREATED);
    }

    @GetMapping("")
    public Iterable<sala> getSala() {
        return salaService.listAll();
    }

    @GetMapping("/{id}")
    public sala getSala(@PathVariable("id") Long id) {
        return salaService.getSala(id);
    }

    @DeleteMapping("/{id}")
    public void deleteSala(@PathVariable("id") Long id){
        salaService.deleteSala(id);
    }
}