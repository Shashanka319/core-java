package com.xworkz.Language;

public class EngilshLanguage extends Language{
    String name;
    String religeon;

    public EngilshLanguage(LanguageLocation languageLocation, LanguageType languageType, String[] religeons, int count, boolean nativeLanguageGood, String name, String religeon) {
        super(languageLocation, languageType, religeons, count, nativeLanguageGood);
        this.name = name;
        this.religeon = religeon;
    }
    public void info(){
        super.info();
    }
    public void  religeonDetaile(){
        super.religeonDetaile();
    }
    public String toString(){
        return super.toString();
    }

}
