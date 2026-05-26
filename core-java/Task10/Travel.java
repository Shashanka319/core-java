class Travel{
	static void information(String seatType){
		System.out.println("Information of Seat Type:"+seatType);
		if(seatType==null){
			System.out.println("Data is Invalid...");
			return;
		}
		System.out.println("Data is Valid....");
	}
	static void information(boolean isAvailable){
		System.out.println("Inforamation Of Seat is Avialable:"+isAvailable);
		if(isAvailable==false){
			System.out.println("Dats is Invalid...");
			return;
		}
		System.out.println("Data is Valid..");
	}
}