package com.hapangama.firstspring;

import com.hapangama.firstspring.domain.Role;
import com.hapangama.firstspring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // this is where our microservice starts
public class FirstSpringApplication implements CommandLineRunner {

    @Autowired
    private PersonService personService;

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringApplication.class, args);
    }


    public void createAllPeoPle(){
        personService.createPerson("kasun", 21, Role.DEVELOPER);
        personService.createPerson("Janith", 21, Role.MANAGER);
    }

    @Override
    public void run(String... args) throws Exception {
       createAllPeoPle();
       System.out.println("count " + personService.total());
    }
}
