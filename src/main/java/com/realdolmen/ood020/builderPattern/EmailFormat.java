package com.realdolmen.ood020.builderPattern;

/**
 * This is my Abstract Builder
 */
public abstract class EmailFormat {
    public String generateHeader() {
        return null;
    }

    public String generateTitle(String s) {
        return "";
    }

    public String generateBodyHeader() {
        return "";
    }

    public String generateFromLine(String s) {
        return null;
    }

    public String generateToLine(String s) {
        return null;
    }

    public String generateSubjectLine(String s) {
        return null;
    }

    public String generateBodyLine(String s) {
        return null;
    }

    public String generateFooter() {
        return null;
    }

}
