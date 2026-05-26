class OceanRunner{
	public static void main(String[]value){
		System.out.println("Ocean Information:");
		Ocean.oceanInfo("Pacific",15500,0.15f,34.5f,"Blue Whale");
		Ocean.oceanInfo("Atlantic",11100,0.05f,35.5f,"Giant Squid");
		Ocean.oceanInfo("Indian",10000,0.02f,34.8f,"Whale Shark");
		Ocean.oceanInfo("Southern",21000,0.10f,34.4f,"Colossal Squid");
		Ocean.oceanInfo("Arctic",4500,0.25f,30.0f,"Lion's Mane Jelly");
	}
}