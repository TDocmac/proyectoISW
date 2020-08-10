package com.quimio.proyecto.salas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@RequestMapping("/api/salas")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
public class salaControlador {

    @Autowired
    private salaService salaService;

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseBody
    public String handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
        String name = ex.getName();
        String type = ex.getRequiredType().getSimpleName();
        Object value = ex.getValue();
        String message = String.format("'%s' Deberia ser '%s' y '%s', por favor ponga el tipo correcto!",
                name, type, value);

        return message;
    }

    @PostMapping("")
    public ResponseEntity<sala> addSala(@RequestBody sala sala) {
        sala s = salaService.saveOrUpdateSala(sala);
        return new ResponseEntity<sala>(s, HttpStatus.CREATED);
    }

    @GetMapping("")
    @ResponseBody
    public Iterable<sala> getSala(@RequestParam(required = false) String capacidad) {
        if (capacidad == null){
            return salaService.listAll();
        }
        else{
            try{
                int val = Integer.parseInt(capacidad);
                return salaService.getSala(val);
            } catch(Exception f){
                return null;
            }

        }
    }

    @GetMapping("/{id}")
    public sala getSala(@PathVariable("id") Long id) {
        return salaService.getSala(id);
    }

    @DeleteMapping("/{id}")
    public void deleteSala(@PathVariable("id") Long id){
        sala encontrado = salaService.getSala(id);
        salaService.deleteSala(id);
    }
}
