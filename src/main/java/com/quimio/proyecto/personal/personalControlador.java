package com.quimio.proyecto.personal;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/personal")
public class personalControlador {

    @Autowired
    private personalService personalService;

    @PostMapping("")
    public ResponseEntity<personal> addPersonal(@RequestBody personal personal) {
        personal med = personalService.saveOrUpdatePersonal(personal);
        return new ResponseEntity<personal>(med, HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public personal getPersonal(@PathVariable("id") Long id) {
        return personalService.getPersonal(id);
    }

    @DeleteMapping("/{id}")
    public void deletePersonal(@PathVariable("id") Long id){
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