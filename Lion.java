class Lion{
	int noOfLion;
	String name;
	String zooName;
	boolean isThere;
	int size;
	LionType type;
	LionEyeColor eyeColor;
	Zoo zoo;
	Cornivours cornivours;
	King king;
	
	Lion(int noOfLion,String name,String zooName,boolean isThere,int size,
	LionType type,LionEyeColor eyeColor,Zoo zoo,Cornivours cornivours,King king)
	{
		this.noOfLion=noOfLion;
		this.name=name;
		this.zooName=zooName;
		this.isThere=isThere;
		this.size=size;
		this.type=type;
		this.eyeColor=eyeColor;
		this.zoo=zoo;
		this.cornivours=cornivours;
		this.king=king;
		System.out.println("Aceess the instance variables with primitive and Non Primitive Data Types");
		
		
	}
}