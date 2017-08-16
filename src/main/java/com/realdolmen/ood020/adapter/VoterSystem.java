package com.realdolmen.ood020.adapter;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public abstract class VoterSystem {
    private long age;
    public long hasAge(){
        return age;
    }

    public boolean canVote(VoterPerson vp){
        return (vp.hasAge()>=18);
    }

}
