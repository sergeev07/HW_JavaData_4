package ru.netology.javadata_4_hibernate.servise;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.javadata_4_hibernate.entity.Person;
import ru.netology.javadata_4_hibernate.repository.PersonRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> getPersonsByCity(String city) {
        return personRepository.getPersonsByCity(city);
    }
}
