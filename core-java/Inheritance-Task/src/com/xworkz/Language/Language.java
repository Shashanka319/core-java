package com.xworkz.Language;

import java.util.Arrays;

public class Language {
    LanguageLocation languageLocation;
    LanguageType languageType;
    String[] religeons;
    int count;
    boolean nativeLanguageGood;

    public Language(LanguageLocation languageLocation, LanguageType languageType, String[] religeons, int count, boolean nativeLanguageGood) {
        this.languageLocation = languageLocation;
        this.languageType = languageType;
        this.religeons = religeons;
        this.count = count;
        this.nativeLanguageGood = nativeLanguageGood;
    }
    public void info(){
        System.out.println("Executing the Information in Language...");
    }
    public void religeonDetaile(){
        System.out.println("Executing the Detailes Of Relion in Language");
    }
    public String toString(){
        return "Language Location:"+languageLocation+",Language Type:"+languageType+",Language Relion:"+ Arrays.toString(religeons)+"Counnt:"+count+"Native Language is Good:"+nativeLanguageGood;
    }
}
