package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PersonDataAccessService implements PersonDao {
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return null;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<String> deletePersonById(UUID id) {
        return null;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }
}
