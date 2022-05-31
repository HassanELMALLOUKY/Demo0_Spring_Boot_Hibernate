package com.isi.demo0.services;

import com.isi.demo0.entites.Departement;
import com.isi.demo0.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @Transactional
public class DepartementServiceImpl implements DepartementService {
    @Autowired
    private DepartementRepository departementRepository;
    @Override
    public void nombre_Dep() {
        List<Departement> d=departementRepository.findAll();
        System.out.println(d.size());
    }
}
