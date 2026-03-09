class Tea{
	int count;
	double price;
	boolean hot;
	String name;
	boolean sugar;
	TeaType type;
	TeaShop shop;
	House house;
	Hotel hotel;
	TeaFactory factory;

	Tea(int count,double price,boolean hot,String name,boolean sugar,
	TeaType type,TeaShop shop,House house,Hotel hotel,TeaFactory factory)
	{
		this.count=count;
		this.price=price;
		this.hot=hot;
		this.name=name;
		this.sugar=sugar;
		this.type=type;
		this.shop=shop;
		this.house=house;
		this.hotel=hotel;
		this.factory=factory;
		System.out.println("Access the instance Varables.....");
	}
	
	
}