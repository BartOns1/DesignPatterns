package com.realdolmen.ood020.adapter;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class VoterPerson extends VoterSystem {

    //Person p = new Person("2000-12-12");

    PersonInterface pi;

    public VoterPerson(PersonInterface pi) {
        this.pi = pi;
    }




    @Override
    public long hasAge(){
       // LocalDate birthdate = pi.hasBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //Als je gebruik maakt va LocalDate is regel boven niet nodig

        LocalDate now = LocalDate.now();
        return ChronoUnit.YEARS.between(pi.hasBirthDate(), now);
    }

}
