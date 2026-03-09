class BellRunner{
	public static void main(String[] values){
		BellType type=new BellType();
		BellColor color=new BellColor();
		BellCompany company=new BellCompany();
		Clock clock = new Clock();
		Cycle cycle = new Cycle();
		Bell bell = new Bell(1,"Shree Ganesh",2,500,true,type,color,company,clock,cycle);
	
	}
}