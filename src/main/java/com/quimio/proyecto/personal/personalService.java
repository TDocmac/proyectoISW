package com.quimio.proyecto.personal;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personalService {

    @Autowired
    private personalRepository personalRepository;

    public personal saveOrUpdatePersonal(personal personal) {
        return personalRepository.save(personal);
    }

    public Iterable<personal> listAll() {
        return personalRepository.findAll();
    }

    public personal getPersonal(Long id) {
        return personalRepository.findById(id)
            .orElseThrow(() -> new personalNotFoundException(id));
    }

    public void deletePersonal(Long id){
        personalRepository.deleteById(id);
    }

    public List<personal> getCargo(String cargo) {
        return personalRepository.findByCargo(cargo);
    }
}