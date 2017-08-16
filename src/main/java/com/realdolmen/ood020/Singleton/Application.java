package com.realdolmen.ood020.Singleton;

/**
 * Created by vdabcursist on 16/08/2017.
 */
/*
public class Application {
    private static Application INSTANCE;
    //instance is tot hier null en private

    private Application(){};

    public static synchronized Application getINSTANCE(){
        if (INSTANCE==null){
            INSTANCE = new Application(); //dit noemt men een luie methode, want instance wordt pas aangemaakt bij eerste oproep
        }
        return INSTANCE;
    }
}*/ //deze code enkel als collega singleton zo gemaakt heeft, anders doe je het zoals hieronder
//opgepast bi multithreading kan dit 2 keer opgeroepen worden, daarom afschermen dat maar 1 user gelijktijdig de singleton kan gebruiken, darom synchrinised

//andere oplossing is om niet lazy aan te maken, dat is dan bij de eerste lijn new gebruiken, dan geen probleem voor multithreading omdat het meteen wordt aangemaakt
//bij singleton kan ook implements Seriazable gebruikt worden om data weg te schrijven, maar dan ook probleem voor multithreading-->truck read resolve

public  enum Application{
    INSTANCE
}
//dit is oplossing voor seriazable probleem:  dit is ook automatisch seriazable en veilig voor multitreading