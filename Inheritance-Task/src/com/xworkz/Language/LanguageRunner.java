package com.xworkz.Language;

public class LanguageRunner {
    public static void main(String[] args) {
        LanguageLocation languageLocation= new LanguageLocation("Kannad","Karnataka");
        String[] religeons = {"Hindhu","Islam","Buddism","Gurunanak"};
        System.out.println("Parent Class Information......");
        Language language = new Language(languageLocation,LanguageType.ENGLISH,religeons,1,true);
        language.info();
        language.religeonDetaile();
        System.out.println(language.toString());

        System.out.println("Chaild Class Information........");
        EngilshLanguage engilshLanguage = new EngilshLanguage(languageLocation,LanguageType.ENGLISH,religeons,1,true,"English","Hindhu");
        engilshLanguage.info();
        engilshLanguage.religeonDetaile();
        System.out.println(language.toString());
    }
}
