class Hospital{
	static void bookAppointmet(String patientName,String symptom){
		System.out.println("Patient Name:"+patientName);
		System.out.println("Symptom:"+symptom);
		String patientNames="Maruthi";
		String symptoms="Body Heat";
		int bp=98;
		boolean sugar=true;
		Nurse.basicCheck(patientName,symptom,bp,sugar);
	}
}