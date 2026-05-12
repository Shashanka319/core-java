package com.xworkz.Jail;

import java.util.Arrays;

public class Jail {
    JailLocation location;
    JailType type;
    String[] criminals;
    int criminalNo;
    boolean jailer;

    public Jail(JailLocation location, JailType type, String[] criminals, int criminalNo, boolean jailer) {
        this.location = location;
        this.type = type;
        this.criminals = criminals;
        this.criminalNo = criminalNo;
        this.jailer = jailer;
    }
    public void jailInfo(){
        System.out.println("Executing the Information of Jail In Jail");
    }
    public void criminalInfo(){
        System.out.println("Executing the Criminal Infomration in Jail");
    }
    public String toString(){
        return "Location:"+location+"Type:"+type+"Criminals:"+ Arrays.toString(criminals)+"Criminal No:"+criminalNo+"Jailer:"+jailer;
    }
}
