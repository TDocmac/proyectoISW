package com.quimio.proyecto.sillones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sillonService {

    @Autowired
    private sillonRepository sillonRepository;

    public sillon saveOrUpdateSillon(sillon sillon) {
        return sillonRepository.save(sillon);
    }

    public Iterable<sillon> listAll() {
        return sillonRepository.findAll();
    }

    public sillon getSillon(Long id) {
        return sillonRepository.findById(id)
            .orElseThrow(() -> new sillonNotFoundException(id));
    }

    public void deleteSillon(Long id){
        sillonRepository.deleteById(id);
    }

    public List<sillon> getSillon(String estado) {
        return sillonRepository.findByEstado(estado);
    }

}