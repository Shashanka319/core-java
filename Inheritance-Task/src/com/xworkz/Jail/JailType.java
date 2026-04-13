package com.xworkz.Jail;

public class JailType {
    String type;
    String JailerName;

    public JailType(String type, String jailerName) {
        this.type = type;
        JailerName = jailerName;
    }
    public String toString(){
        return "Type:"+type+ "JailerName:"+JailerName;
    }
}
