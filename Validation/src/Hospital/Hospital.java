package Hospital;

class Hospital{
    static void detailes(String patientName,int noOfPatient){
        System.out.println("Patient Name:"+patientName);
        System.out.println("Number Of Patient:"+noOfPatient);
        if(patientName==null){
            System.out.println("Data is Invalid....");
            return;
        }
        if(noOfPatient<0){
            System.out.println("Data is Invalid...");
            return;
        }
        System.out.println("Data is Valid...");
    }
    static void detailes(String name,boolean isAdmit){
        System.out.println("Patient Name:"+name);
        System.out.println("Patient Is Admitt:"+isAdmit);
        if(name==null){
            System.out.println("Data is Invalid");
            return;
        }
        if(isAdmit==false){
            System.out.println("Data is Invalid");
            return;
        }
        System.out.println("Data is Valid");
    }
}
