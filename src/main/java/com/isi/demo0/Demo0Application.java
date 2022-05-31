package com.isi.demo0;

import com.isi.demo0.repository.DepartementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.isi.demo0.entites.Departement;

@SpringBootApplication
public class Demo0Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo0Application.class, args);
    }
    @Bean
    CommandLineRunner start(DepartementRepository departementRepository){
        return args -> {
            departementRepository.save(new Departement("Science Math et Info"));
            departementRepository.save(new Departement("Science Phy"));
            departementRepository.save(new Departement("Science Vie"));

            departementRepository.findAll().forEach(dp->{
                System.out.println("id: "+dp.getIdDepartement()+"  dep name: "+dp.getName());
            });

        };
    }
}
