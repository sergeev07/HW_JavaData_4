package ru.netology.javadata_4_hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import ru.netology.javadata_4_hibernate.entity.Person;

import java.util.List;


@Repository
@Transactional
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("SELECT p FROM Person p WHERE upper(p.sity_of_living)= upper(:city)")
                .setParameter("city", city).getResultList();
    }
}
