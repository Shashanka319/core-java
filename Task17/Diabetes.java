class Diabetes {
    int patientId;
    String patientName;
    int age;
    String diabetesType;
    double bloodSugarLevel;
    double hba1cPercentage;
    double insulinDosage;
    boolean isInsulinDependent;
    String medicationName;
    double bodyMassIndex;
    int dailyCarbLimit;
    boolean hasHighBloodPressure;
    String diagnosisDate;
    String primarySymptom;
    int dailyStepGoal;
    String lastCheckupDate;
    double kidneyFunctionScore;
    boolean historyOfRetinopathy;
    String glucoseMonitoringMethod;
    String doctorName;

    Diabetes(int patientId, String patientName, int age, String diabetesType, double bloodSugarLevel, 
             double hba1cPercentage, double insulinDosage, boolean isInsulinDependent, String medicationName, 
             double bodyMassIndex, int dailyCarbLimit, boolean hasHighBloodPressure, String diagnosisDate, 
             String primarySymptom, int dailyStepGoal, String lastCheckupDate, double kidneyFunctionScore, 
             boolean historyOfRetinopathy, String glucoseMonitoringMethod, String doctorName) {
        
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.diabetesType = diabetesType;
        this.bloodSugarLevel = bloodSugarLevel;
        this.hba1cPercentage = hba1cPercentage;
        this.insulinDosage = insulinDosage;
        this.isInsulinDependent = isInsulinDependent;
        this.medicationName = medicationName;
        this.bodyMassIndex = bodyMassIndex;
        this.dailyCarbLimit = dailyCarbLimit;
        this.hasHighBloodPressure = hasHighBloodPressure;
        this.diagnosisDate = diagnosisDate;
        this.primarySymptom = primarySymptom;
        this.dailyStepGoal = dailyStepGoal;
        this.lastCheckupDate = lastCheckupDate;
        this.kidneyFunctionScore = kidneyFunctionScore;
        this.historyOfRetinopathy = historyOfRetinopathy;
        this.glucoseMonitoringMethod = glucoseMonitoringMethod;
        this.doctorName = doctorName;
    }

    void display() {
        System.out.println("Patient ID: " + this.patientId);
        System.out.println("Name: " + this.patientName );
        System.out.println("Type: " + this.diabetesType);
        System.out.println("Blood Sugar: " + this.bloodSugarLevel );
        System.out.println("HbA1c: " + this.hba1cPercentage );
        System.out.println("Insulin: " + this.insulinDosage );
        System.out.println("Insulin Dependent: " + this.isInsulinDependent);
        System.out.println("Medication: " + this.medicationName);
        System.out.println("BMI: " + this.bodyMassIndex);
        System.out.println("Carb Limit: " + this.dailyCarbLimit);
        System.out.println("High BP: " + this.hasHighBloodPressure);
        System.out.println("Diagnosis Date: " + this.diagnosisDate);
        System.out.println("Symptom: " + this.primarySymptom);
        System.out.println("Step Goal: " + this.dailyStepGoal);
        System.out.println("Last Checkup: " + this.lastCheckupDate);
        System.out.println("Kidney Score: " + this.kidneyFunctionScore);
        System.out.println("Retinopathy: " + this.historyOfRetinopathy);
        System.out.println("Monitoring: " + this.glucoseMonitoringMethod);
        System.out.println("Doctor: " + this.doctorName);
        
    }
}