package com.xworkz.Jail;

public class CentralJail extends Jail {
    String jailerName;
    String location;

    public CentralJail(JailLocation location, JailType type, String[] criminals, int criminalNo, boolean jailer, String jailerName, String location1) {
        super(location, type, criminals, criminalNo, jailer);
        this.jailerName = jailerName;
        this.location = location1;
    }
    void info(){
        jailInfo();
        criminalInfo();
    }


}
