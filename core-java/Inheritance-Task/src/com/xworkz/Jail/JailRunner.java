package com.xworkz.Jail;

public class JailRunner {
    public static void main(String[] args) {
        JailType jailType = new JailType("Cental Jail","RajendraPrasad");
        String[] criminals={"Rajendra","Shankar","Bhabu"};
        System.out.println("Information Of Parent Class....");
        Jail jail = new Jail(JailLocation.BALLARI,jailType,criminals,102,true);
        jail.jailInfo();
        jail.criminalInfo();
        System.out.println(jail.toString());

        System.out.println("Information of Child Class...");
        CentralJail centralJail = new CentralJail(JailLocation.BANGALORE,jail.type,jail.criminals,jail.criminalNo,jail.jailer,"Rajendra Prasad","Bangalore");
        centralJail.info();
        System.out.println(centralJail.toString());



    }

}
