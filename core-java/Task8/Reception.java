class Reception{
	static void book(String patientName,String symptom,String email,long mobile){
		System.out.println("PatietName:"+patientName);
		System.out.println("Symptom:"+symptom);
		System.out.println("Email:"+email);
		System.out.pritln("Mobile Nunber:"+mobile);
		String name="Kishore";
		String symptom="Body Pain";
		Hospital.bookAppointmet(name,symptom);
		
	}
}