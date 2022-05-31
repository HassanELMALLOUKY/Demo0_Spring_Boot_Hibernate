package com.isi.demo0.web;

import com.isi.demo0.entites.Departement;
import com.isi.demo0.repository.DepartementRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@RestController
public class DepRestController {
    private DepartementRepository departementRepository;

    public DepRestController(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }
    @GetMapping(path = "/departements")
    public List<Departement> listeDep(){
        return departementRepository.findAll();
    }
    @GetMapping(path = "/departements/{id}")
    public Departement getDep(@PathVariable int id){
        return departementRepository.findById(id).get();
    }
    @PutMapping(path = "/update/{id}")
    public Departement updateDep(@PathVariable(name = "id") int code,@RequestBody Departement departement){
        departement.setIdDepartement(code);
        return departementRepository.save(departement);
    }
    @DeleteMapping(path = "/delete/{id}")
    public void deleteDep(@PathVariable(name = "id") int code){
        departementRepository.deleteById(code);
    }

}
