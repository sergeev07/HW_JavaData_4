package ru.netology.javadata_4_hibernate.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PERSON")
public class Person {
    @EmbeddedId
    private PerosonPK personPK;

    @Column
    private String phone_number;

    @Column
    private String sity_of_living;

}
