class CricketWorldupRunner{
	public static void main(String []args){
		
		CricketWorldup.registerTeam("RCB","Virat Kohli",3,true,16);
		CricketWorldup.registerTeam("Chenni","MS Dhoni",2,false,16);
		CricketWorldup.registerTeam("Mumbai Indian","Rohith Kumar",1,true,16);
		
		
		CricketWorldup.saveMatch(101,"RCB","CSK","Chinna Swami Stadium","Bangalore",12092025l,6.30f,20,true,"Main Umpire","Leg Umpire");
		CricketWorldup.saveMatch(102,"Mobai Indians","CSK","Channi Stadium","Channi",15102025l,12.30f,20,true,"Main Umpire","Leg Umpire");
		CricketWorldup.saveMatch(101,"Gujarath","Mobai Indians","Mobai Stadium","Mumbai",23042025l,3.30f,20,true,"Main Umpire","Leg Umpire");
		
		CricketWorldup.savePlayer("Virat Kohli","RCB",17,"BatsMan",true,false,121,1153,5,115.4f,45.0f);
		CricketWorldup.savePlayer("MS Dhoni","CSK",6,"Keeper",true,false,123,1133,4,145.4f,45.0f);
		CricketWorldup.savePlayer("Rohith Kumar","Mobai Indians",18,"BatsMan",true,false,111,1223,5,145.4f,48.0f);
		
		CricketWorldup.caluclateRunRate(100,12,false);
		CricketWorldup.caluclateRunRate(103,14,true);
		
		CricketWorldup.checkQualification(47,129.82f,5);
		CricketWorldup.checkQualification(87,109.87f,7);
	
		CricketWorldup.manOfTheMatch("ViratKohli",15,9);
		CricketWorldup.manOfTheMatch("MS Dhoni",115,2);
		
		
	}
}