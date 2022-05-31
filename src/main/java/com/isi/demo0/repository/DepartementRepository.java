package com.isi.demo0.repository;

import com.isi.demo0.entites.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DepartementRepository extends JpaRepository<Departement, Integer> {
    public void findAllByName(String name);

}
