class ProfileStoreRunner{
		public static void main(String[] args){
		Profile profile1=new Profile("Shashank_1986","Instagram",true,400,12,true);
		Profile profile2=new Profile("Shashank.k933","Instagram",true,570,12,true);
		Profile profile3=new Profile("shashi_1986","Facebook",true,400,4,true);
		Profile profile4=new Profile("Sharu_1986","Linkdien",true,400,12,true);
		Profile profile5=new Profile("Shashank3199","Instagram",true,400,12,true);
		Profile profile6=new Profile("Sharath","Linkdien",true,400,12,true);
		Profile profile7=new Profile("ShankSharu","github",true,30,12,true);
		Profile profile8=new Profile("Shashank_1986","Instagram",true,400,12,true);
		Profile profile9=new Profile("Sharu","Instagram",true,400,12,true);
		Profile profile10=new Profile("Shankar","twitter",true,400,12,true);
		profile1.info();
		
		Profile[] saves = new Profile[10];
		ProfileStore stores =new ProfileStore(saves);
		stores.storeProfile(profile1);
		
		profile2.info();
		stores.storeProfile(profile2);
		
		profile3.info();
		stores.storeProfile(profile3);
		
		profile4.info();
		stores.storeProfile(profile4);
		
		profile5.info();
		stores.storeProfile(profile5);
		
		profile6.info();
		stores.storeProfile(profile6);
		
		profile7.info();
		stores.storeProfile(profile7);
		
		profile8.info();
		stores.storeProfile(profile8);
		
		profile9.info();
		stores.storeProfile(profile9);
		
		profile10.info();
		stores.storeProfile(profile10);
	}
}