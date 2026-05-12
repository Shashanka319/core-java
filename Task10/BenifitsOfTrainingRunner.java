class BenifitsOfTrainingRunner{
	public static void main(String[] alues){
		System.out.println("Training Benifits:");
		String certificate="Completion Certificate";
		BenifitsOfTraining.get(certificate);
		certificate="Completion Certificate";
		String Experience="Practical Experience";
		BenifitsOfTraining.get(certificate,Experience);
		
		System.out.println("--------------->Method OverLoading<----------------------------------");
		
	}
}