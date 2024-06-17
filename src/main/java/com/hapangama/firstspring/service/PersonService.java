package com.hapangama.firstspring.service;

import com.hapangama.firstspring.domain.Person;
import com.hapangama.firstspring.domain.Role;
import com.hapangama.firstspring.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository personRepo;

    @Autowired
    public PersonService(PersonRepository personRepo){
        this.personRepo = personRepo;
    }

    public Person createPerson(String name, int age, Role role){
        return personRepo.findByName(name).orElse(personRepo.save(new Person(name, age, role)));
    }

    public Iterable<Person> lookup(){
        return personRepo.findAll();
    }

    public long total(){
        return personRepo.count();
    }


}
