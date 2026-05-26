class Nurse{
	static void basicCheck(String patientName,String symptopm,int bp,boolean sugar){
		System.out.println("Patient Name:"+patientName);
		System.out.println("Symptom:"+symptopm);
		System.out.println("BP:"+bp);
		System.out.println("Sugar:"+sugar);
		String name="Shashanka";
		String symptopms="sweat";
		
		Doctor.treat(name,symptopms);
	}
}