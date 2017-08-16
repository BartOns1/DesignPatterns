package com.realdolmen.ood020.adapter;

import com.realdolmen.ood020.utils.DateUtils;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class Main {
    public static void main(String[] args) {

        Person person = new Person(LocalDate.of(1972, Month.JANUARY,11));
        VoterSystem v = new VoterPerson(person);

        System.out.println(v.hasAge());
        System.out.println(v.canVote(new VoterPerson(person)));//de new voterPerson is de adapter rond person

    }

}
