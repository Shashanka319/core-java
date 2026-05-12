class PainterRunner{
	public static void main(String[] values){
		PaintName[] paint=new PaintName[3];
		paint[0]=new PaintName("Assian White Paint",500);
		paint[1]=new PaintName("Lappa",1000);
		paint[2]=new PaintName("red Assan Paint",1500.5);
		
		
		
		double[] salary={500,600,750};
		Painter painter=new Painter(salary,paint);
		painter.getInfo();
	}
}