package com.hendisantika.service;

import com.hendisantika.dao.PersonDAO;
import com.hendisantika.domain.Person;
import com.hendisantika.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by ekansh on 13/7/15.
 */
@Service
public class PersonService {

    @Autowired
    private PersonDAO personDAO;

    @Autowired
    private PersonRepository personRepository;

    public Object findAll(){
        return personRepository.findAll();
    }

    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }

    public Person save(Person person){
        return personRepository.save(person);
    }

}
