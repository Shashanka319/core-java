class Travel{
	static void busInfo(String busName,String seattype,boolean isConfirm){
		System.out.println("Bus Name:"+busName);
		System.out.println("Seat Type:"+seattype);
		System.out.println("Bus Is Avilable:"+isConfirm);
		if(busName==null){
			System.out.println("Data is Invalid,Make a Bus Name is Not a Null");
			return;
		}
		if(seattype==null){
			System.out.println("Data is Invalid, Make a Seat Type is Not a Null");
			return;
		}
		if(isConfirm==false){
			System.out.println("Data is Invalid...");
			return;
		}
		System.out.println("Data is Valid");
	}
	static void trainInfo(String trainName,String classType,boolean isConfirm){
		System.out.println("Train Name:"+trainName);
		System.out.println("Class Type:"+classType);
		System.out.println("Train is Avilable:"+isConfirm);
		if(trainName==null){
			System.out.println("Data is Invalid,Make a Train Name is Not Null");
			return;
		}
		if(classType==null){
			System.out.println("Data is Invalid,Make a class Type is Not Null");
			return;
		}
		if(isConfirm==false){
			System.out.println("Data is Invalid");
			return;
		}
		System.out.println("Data is Valid");
		
	}
}