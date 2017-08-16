package com.realdolmen.ood020.builderPattern;

/**
 * This is de DIRECTOR.
 */
public class EmailConvertor {
    private EmailFormat emailformat;



    public EmailConvertor(EmailFormat emailformat) {
        this.emailformat = emailformat;
    }



    public void convertMail(Email email){

        //give instructions to builder for each part, ook file open en close als je naar bestand moet lezen
        emailformat.generateHeader();
        emailformat.generateTitle(email.getSubjectField());
        emailformat.generateBodyHeader();
        emailformat.generateFromLine(email.getFromField());
        emailformat.generateToLine(email.getToField());
        emailformat.generateSubjectLine(email.getSubjectField());
        emailformat.generateBodyLine(email.getMessageField());
        emailformat.generateFooter();


        //om te checken dat het werkt devolgde code

        System.out.println(emailformat.generateHeader());
        System.out.println(emailformat.generateTitle(email.getSubjectField()));
        System.out.println(emailformat.generateBodyHeader());
        System.out.println(emailformat.generateFromLine(email.getFromField()));
        System.out.println(emailformat.generateToLine(email.getToField()));
        System.out.println(emailformat.generateSubjectLine(email.getSubjectField()));
        System.out.println(emailformat.generateBodyLine(email.getMessageField()));
        System.out.println(emailformat.generateFooter());

    }
}
