class FestivalRunner{
	public static void main(String[] args){
		Festival info1 = new Festival("Ugadhi","19-03-2026","Hindhu",true,false,2);
		Festival info2 = new Festival("Depavali","19-10-2025","Hindhu",true,false,3);
		Festival info3 = new Festival("Ganesh Chaturthi","30-08-2025","Hindhu",true,false,3);
		Festival info4 = new Festival("Ramzan","19-03-2026","Musalman",true,false,1);
		Festival info5 = new Festival("Independance Day","15-08-2025","All Indians",true,true,1);
		Festival info6 = new Festival("Rebulic Day","26-01-2026","All Indians",true,true,1);
		Festival info7 = new Festival("Sankranthi","15-01-2026","Hindhu",true,false,2);
		Festival info8 = new Festival("ShivaRathri","12-01-226","Hindhu",true,false,1);
		Festival info9 = new Festival("Bhoomi Unnime","16-05-226","Hindhu",true,false,1);
		Festival info10 = new Festival("Krismas Day","25-12-2026","Crishians",true,false,1);

		info1.festivalInfo();
		Festival[] festivals = new Festival[10];
		FestivalStore festivalStore = new FestivalStore(festivals);
		festivalStore.saveFestival(info1);
		
		info2.festivalInfo();
		festivalStore.saveFestival(info2);
		
		info3.festivalInfo();
		festivalStore.saveFestival(info3);
		
		info4.festivalInfo();
		festivalStore.saveFestival(info4);
		
		info5.festivalInfo();
		festivalStore.saveFestival(info5);
		
		info6.festivalInfo();
		festivalStore.saveFestival(info6);
		
		info7.festivalInfo();
		festivalStore.saveFestival(info7);
		
		info8.festivalInfo();
		festivalStore.saveFestival(info8);
		
		info9.festivalInfo();
		festivalStore.saveFestival(info9);
		
		info10.festivalInfo();
		festivalStore.saveFestival(info10);
		
		
		
		
	}
}