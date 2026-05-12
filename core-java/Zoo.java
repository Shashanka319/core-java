class Zoo{
	String zooName;
	String animal;
	double entryFees;
	String type;
	int noOfAnimal;
	boolean danger;
	
	Zoo(String zooName,String animal,double entryFees,String type,int noOfAnimal,boolean danger)
	{
		this.zooName=zooName;
		this.animal=animal;
		this.entryFees=entryFees;
		this.type=type;
		this.noOfAnimal=noOfAnimal;
		this.danger=danger;
	}
	void getInfoOfZoo(){
		System.out.println("Zoo Nmae:"+this.zooName);
		System.out.println("Entry Fees:"+this.entryFees);
		System.out.println("Animal Name:"+this.animal);
		System.out.println("Animal Type:"+this.type);
		System.out.println("Number Of Animals:"+this.noOfAnimal);
		System.out.println("Is Danger:"+this.danger);
	}
	
}