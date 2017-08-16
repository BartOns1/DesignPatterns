package com.realdolmen.ood020.builderPattern;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public class Driver {
    public static void main(String[] args) {
        Email e = new Email("Jansens Tom","Bob baab", "Meeting", "Wanneer kan je naar de meeting komen?");

       EmailFormat emailFormat = new XMLFormat();
       EmailConvertor ec = new EmailConvertor(emailFormat);
       ec.convertMail(e);

    }
}
