package com.isi.demo0.web;

import com.isi.demo0.services.DepartementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
    @Autowired
    private DepartementServiceImpl departementService;
    @GetMapping(path = "/nmbrDep")
    public void afficher(){
        departementService.nombre_Dep();
    }
}
