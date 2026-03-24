class CapRunner{
	public static void main(String [] args){
		Cap info = new Cap("Boy",50,1,true,"Cloth","Black");
		Cap info1 = new Cap("King",100,2,true,"cloth","Blcok");
		Cap info2 = new Cap("Jungle",200,2,true,"Cloth","Red");
		Cap info3 = new Cap("Lion",150,1,false,"wood","Yello");
		Cap info4 = new Cap("Tiger",100,2,true,"Cloth","White");
		Cap info5 = new Cap("Brand",200,1,false,"Cloth","Green");
		Cap info6 = new Cap("Grand",300,1,true,"Nylon","Block");
		Cap info7 = new Cap("House",100,2,true,"Thick Cloth","Brown");
		Cap info8 = new Cap("Money",500,2,false,"cloth","Green");
		Cap info9 = new Cap("Ball",100,3,true,"Cloth","Block");
		
		
		info.capInfo();
		Cap[] caps=new Cap[10];
		CapStore save = new CapStore(caps);
		save.capStore(info);
		
		info1.capInfo();
		save.capStore(info1);
		
		
		info2.capInfo();
		save.capStore(info2);
		
		
		info3.capInfo();
		save.capStore(info3);
		
		
		info4.capInfo();
		save.capStore(info4);
		
		
		info5.capInfo();
		save.capStore(info5);
		
		
		info6.capInfo();
		save.capStore(info6);
		
		
		info7.capInfo();
		save.capStore(info7);
		
		
		info8.capInfo();
		save.capStore(info8);
		
		
		info9.capInfo();
		save.capStore(info9);
		
	}
}