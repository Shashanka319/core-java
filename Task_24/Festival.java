class Festival{
	String festivalName;
	String date;
	String relegion;
	boolean holiday;
	boolean compulsoryToCelebrate;
	int noOfDays;
	
	Festival(String festivalName,String date,String relegion,boolean holiday,boolean compulsoryToCelebrate,int noOfDays){
		this.festivalName=festivalName;
		this.date=date;
		this.relegion=relegion;
		this.holiday=holiday;
		this.compulsoryToCelebrate=compulsoryToCelebrate;
		this.noOfDays=noOfDays;
	}
	
	void festivalInfo(){
		System.out.println("Festival Name:"+this.festivalName);
		System.out.println("Date:"+this.date);
		System.out.println("Relegion:"+this.relegion);
		System.out.println("Is Holiday:"+this.holiday);
		System.out.println("It is Compulsory to Celebrate:"+this.compulsoryToCelebrate);
		System.out.println("No Of Days to Celebrate this Festival:"+this.noOfDays);
	}
}