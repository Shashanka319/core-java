class PrinterRunner{
	public static void main(String[] value)
	{
		String[] names={null,"Samsung","Icon Printer"};
	
		Color[] colors=new Color[3];
		colors[0]=new Color("red",200);
		colors[1]=new Color("White",150);
		colors[2]=new Color("Green",100);
		
		Printer printer=new Printer(names,colors);
		printer.display();
		
		
		
	}
}