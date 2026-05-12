class Mobile{
	static void register(String patientName,String symtom,String email,long mobile){
		System.out.println("Patient Name:"+patientName);
		System.out.println(" Symptom:"+symtom);
		System.out.println("Email:"+email);
		System.out.println("Mobile Number:"+mobile);
		patientName="Chandru";
		symtom="weak";
		email="chandu43@gmal.com";
		mobile=9591659198l;
		Reception.book(patientName,symtom,email,mobile);
	}
}