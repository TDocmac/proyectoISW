package com.quimio.proyecto.sillones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sillones")
public class sillonControlador {
    
    @Autowired
    private sillonService sillonService;

    @PostMapping("")
    public ResponseEntity<sillon> addsillon(@RequestBody sillon sillon) {
        sillon s = sillonService.saveOrUpdateSillon(sillon);
        return new ResponseEntity<sillon>(s, HttpStatus.CREATED);
    }

    @GetMapping("")
    @ResponseBody
    public Iterable<sillon> getSillon(@RequestParam(required = false) String estado) {
        if (estado == null){
            return sillonService.listAll();
        }
        else{
            return sillonService.getSillon(estado);
        }
    }

    @GetMapping("/{id}")
    public sillon getSillon(@PathVariable("id") Long id) {
        return sillonService.getSillon(id);
    }

    @DeleteMapping("/{id}")
    public void deleteSillon(@PathVariable("id") Long id){
        sillonService.deleteSillon(id);
    }

    @PostMapping("/{id}")
    public ResponseEntity<sillon> updatesillon(@RequestBody sillon sillon) {
        sillon s = sillonService.saveOrUpdateSillon(sillon);
        return new ResponseEntity<sillon>(s, HttpStatus.CREATED);
    }

}