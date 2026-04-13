package com.xworkz.TrainingInstitute;

public interface Xworkz {
    public void getDetailes();
    public void specilization();

    public default void getStaffDetailes() {
        System.out.println("Executing the Staff Detailes in Xworkz...");
    }

}
