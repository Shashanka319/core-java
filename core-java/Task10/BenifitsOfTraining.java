class BenifitsOfTraining{
	static void get(String certificate){
		System.out.println("Certificate From Training:"+certificate);
		if(certificate==null){
			System.out.println("Data is Invalid");
			return;
		}
		System.out.println("Data is valid");
	}
	static void get(String certificate,String practicalExperience){
		System.out.println("Certificate From Training:"+certificate);
		System.out.println("Benifits From Training:"+practicalExperience);
		if(certificate==null){
			System.out.println("Data is Invalid.....");
			return;
		}
		if(practicalExperience==null){
			System.out.println("Data is InValid");
			return;
		}
		System.out.println("Data is Valid...");
	}
}