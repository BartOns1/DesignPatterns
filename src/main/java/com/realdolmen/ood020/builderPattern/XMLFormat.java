package com.realdolmen.ood020.builderPattern;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public class XMLFormat extends EmailFormat{

    @Override
    public String generateHeader(){
        return "<?xml version=”1.0” encoding=“UTF-8”?> \n <message>\n";
    }
    @Override
    public String generateFromLine(String s){
        return "<from>" + s + "</from>\n";
    }
    @Override
    public String generateToLine(String s){
        return "<to>" + s + "</to>\n";
    }
    @Override
    public String generateSubjectLine(String s){
        return "<subject>" + s + "</subject>\n";
    }
    @Override
    public String generateBodyLine(String s){
        return "<body>" + s + "</body>\n";
    }
    @Override
    public String generateFooter(){
        return "</mesage>\n";
    }


}
