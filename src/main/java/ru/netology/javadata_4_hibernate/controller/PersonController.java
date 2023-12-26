package ru.netology.javadata_4_hibernate.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.javadata_4_hibernate.entity.Person;
import ru.netology.javadata_4_hibernate.servise.PersonService;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/persons/by-city")
    public List<Person> getPerson(@RequestParam("city") String city) {
        return personService.getPersonsByCity(city);
    }

}
