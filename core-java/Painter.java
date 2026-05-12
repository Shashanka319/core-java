class Painter{
	double[] salary;
	PaintName[] paint;
	
	Painter(double[] salary,PaintName[] paint){
		this.salary=salary;
		this.paint=paint;
	}
	void getInfo(){
		System.out.println("Inforamation of the Painter...");
		if(salary!=null){
			System.out.println("Salay of the Painter");
			for(double amount:salary){
				System.out.println("Painter Salary:"+amount);
			}
		}
		else{
			System.out.println("Painter salry is not null");
		}
		if(paint!=null){
			System.out.println("Information of the Paint");
			for(PaintName paintName:paint){
				paintName.getDetailes();
			}	
		}
		else{
			System.out.println("Paint information is null check once");
		}
		
	}
}