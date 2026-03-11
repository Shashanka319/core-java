class Printer{
	String[] names;
	Color[] colors;
	
	Printer(String[] names,Color[] colors){
		this.names=names;
		this.colors=colors;
	}
	void display(){
		System.out.println("Display the information of the printer...");
		if(this.names!=null){
			System.out.println("Total No of Names:"+this.names.length);
			for(String name:this.names){
				System.out.println("Printer Name:"+name);
				
			}
			
		}
		else {
			System.out.println("Names are Empty");
		}
		
		if(this.colors!=null){
			System.out.println("Total Numbers of Colors:" + this.colors.length);

			for(Color color : colors){
				System.out.println("Printer Color:"+color.color);
				System.out.println("Printer Price"+color.priceOfPrinter);
			}
		}
		else
		{
			System.out.println("The Colores are Empty...");
		}
		
	
		
	}
}