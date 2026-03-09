class TeaRunner{
	public static void main(String [] args){
		TeaType type=new TeaType();
		TeaShop shop=new TeaShop();
		House house = new House();
		Hotel hotel=new Hotel();
		TeaFactory factory=new TeaFactory();
		Tea tea = new Tea(2,30,true,"Lemen tea",true,type,shop,house,hotel,factory);
	}
}