package com.hapangama.firstspring.repo;

import com.hapangama.firstspring.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

//Spring data jpa

public interface PersonRepository extends CrudRepository<Person, Long> {
    // <Holing class object, Id type>

    Optional<Person> findByName(@Param("name") String name);

    //overriding and limiting the exposure
    @Override
    @RestResource(exported = false)
    <S extends Person> S save(S entity);

    @Override
    @RestResource(exported = false)
    <S extends Person> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    @RestResource(exported = false)
    void deleteById(Long aLong);

    @Override
    @RestResource(exported = false)
    void delete(Person entity);

    @Override
    @RestResource(exported = false)
    void deleteAllById(Iterable<? extends Long> longs);

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Person> entities);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}