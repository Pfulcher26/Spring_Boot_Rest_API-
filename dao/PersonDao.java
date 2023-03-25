package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson (Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

   Optional<Person> selectPersonById(UUID id);

    ResponseEntity<String> deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
