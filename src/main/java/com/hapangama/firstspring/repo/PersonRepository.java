package com.hapangama.firstspring.repo;

import com.hapangama.firstspring.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

//Spring data jpa

public interface PersonRepository extends CrudRepository<Person, Long> {
    // <Holing class object, Id type>

    Optional<Person> findByName(@Param("name") String name);
}