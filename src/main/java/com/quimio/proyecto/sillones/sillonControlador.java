package com.quimio.proyecto.sillones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api/sillones")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
public class sillonControlador {

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

    
    @Autowired
    private sillonService sillonService;

    @PostMapping("")
    public ResponseEntity<sillon> addsillon(@RequestBody @Validated sillon sillon) {
        sillon s = sillonService.saveOrUpdateSillon(sillon);
        return new ResponseEntity<sillon>(s, HttpStatus.CREATED);
    }

    @GetMapping("")
    @ResponseBody
    public Iterable<sillon> getSillon(@RequestParam(required = false) @Validated String estado) {
        if (estado == null){
            return sillonService.listAll();
        }
        else{
            return sillonService.getSillon(estado);
        }
    }

    @GetMapping("/{id}")
    public sillon getSillon(@PathVariable("id") Long id){ return sillonService.getSillon(id);}

    @DeleteMapping("/{id}")
    public void deleteSillon(@PathVariable("id") Long id){
        sillon encontrado = sillonService.getSillon(id);
        sillonService.deleteSillon(id);
    }

    @PostMapping("/{id}")
    public ResponseEntity<sillon> updatesillon(@PathVariable("id") Long id,@RequestBody sillon sillon) {
        sillon encontrado = sillonService.getSillon(id);

        sillon s = sillonService.saveOrUpdateSillon(sillon);
        return new ResponseEntity<sillon>(s, HttpStatus.CREATED);
    }

}
