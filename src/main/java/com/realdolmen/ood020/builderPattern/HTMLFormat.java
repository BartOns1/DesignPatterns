package com.realdolmen.ood020.builderPattern;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public class HTMLFormat extends EmailFormat {
    @Override
    public String generateHeader(){
        return "<!doctype html> \n <html>\n";
    }
    @Override
    public String generateTitle(String s){
        return "<head>\n" + s + "\n</head>\n";
    }
    @Override
    public String generateBodyHeader(){
        return "<body>\n<table>\n";
    }
    @Override
    public String generateFromLine(String s){
        return "<tr><td>From: " + s + "</td></tr>\n";
    }
    @Override
    public String generateToLine(String s){
        return "<tr><td>to: " + s + "</td></tr>\n";
    }
    @Override
    public String generateSubjectLine(String s){
        return "<tr><td><i>" + s + "</i></td></tr>\n";
    }
    @Override
    public String generateBodyLine(String s){
        return "<tr><td>" + s + "</td></tr>\n";
    }
    @Override
    public String generateFooter(){
        return "</table>\n</body>\n</html>\n ";
    }

}
