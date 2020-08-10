package com.quimio.proyecto.personal;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api/personal")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class personalControlador {

    @Autowired
    private personalService personalService;

    @PostMapping("")
    public ResponseEntity<personal> addPersonal(@RequestBody personal personal) {
        personal med = personalService.saveOrUpdatePersonal(personal);
        return new ResponseEntity<personal>(med, HttpStatus.CREATED);
    }

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
    

    @GetMapping("/{id}")
    public personal getPersonal(@PathVariable("id") Long id) {
        return personalService.getPersonal(id);
    }

    @DeleteMapping("/{id}")
    public void deletePersonal(@PathVariable("id") Long id){
        personal encontrado = personalService.getPersonal(id);
        personalService.deletePersonal(id);
    }

    @GetMapping("")
    @ResponseBody
    public Iterable<personal> getOcupacion(@RequestParam(required = false) String cargo) {
        if (cargo == null){
            return personalService.listAll();
        }
        else{
            return personalService.getCargo(cargo);
        }
    }

}
