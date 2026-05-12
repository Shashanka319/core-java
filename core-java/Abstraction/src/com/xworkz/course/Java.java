package com.xworkz.course;

public interface Java {
    public void courseInfo();
    public void feesInfo();
    public default void oopsInJava(){
        System.out.println("Execute the Oops of Java in Java Course....");
    }
}
