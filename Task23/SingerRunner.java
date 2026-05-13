class SingerRunner{
	public static void main(String[] args){
		String[] singers =new String[10];
		Singer saveNames=new Singer(singers);
		
		saveNames.saveSingerName("Arjun Janya");
		saveNames.saveSingerName("Hamsalekha");
		saveNames.saveSingerName("Bala Sumbramanya");
		saveNames.saveSingerName("Vijay Prakash");
		saveNames.saveSingerName("Rajesh Krushnan");
		saveNames.saveSingerName("Sanjith Hegade");
		saveNames.saveSingerName("Hanumantha");
		saveNames.saveSingerName("Sunil");
		saveNames.saveSingerName("Arjith Singh");
		saveNames.saveSingerName("Anuradha Bhat");
		
		
		boolean found = saveNames.searchSingerName("Arjun Janya");
		System.out.println("Result:"+found);
		
		saveNames.searchSingerName("Vijay Prakash");
		
	}
	
}