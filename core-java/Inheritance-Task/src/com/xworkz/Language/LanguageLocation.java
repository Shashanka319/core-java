package com.xworkz.Language;

public class LanguageLocation {
    String type;
    String state;

    public LanguageLocation(String type, String state) {
        this.type = type;
        this.state = state;
    }
    public String toString(){
        return "Type:"+this.type+"State:"+this.state;
    }
}
