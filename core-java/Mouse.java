class Mouse{
	double price;
	int quantity;
	boolean quality;
	int warenty;
	boolean stackAvailable;
	
	MouseModel model;
	MouseButton button;
	MouseColor color;
	MouseType type;
	MouseLogo logo;
	
	Mouse(double price,int quantity,boolean quality,int warenty,boolean stackAvailable,
	MouseModel model,MouseButton button,MouseColor color,MouseType type,MouseLogo logo)
	{
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
		this.warenty=warenty;
		this.stackAvailable=stackAvailable;
		this.model=model;
		this.button=button;
		this.color=color;
		this.type=type;
		this.logo=logo;
	}
	
}