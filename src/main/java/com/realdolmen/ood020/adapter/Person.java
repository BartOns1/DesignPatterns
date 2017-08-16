package com.realdolmen.ood020.adapter;

import java.time.LocalDate;


/**
 * Created by vdabcursist on 16/08/2017.
 */
public class Person implements PersonInterface {

    private LocalDate birthdate;

    public Person(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public LocalDate hasBirthDate() {
        return birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
