class Jamoon{
	int[] counts;
	Ingridient[] ingrients;
	
	Jamoon(int[] counts, Ingridient[] ingrients){
		this.counts=counts;
		this.ingrients=ingrients;
	}
	void getDisplay(){
		System.out.println("Information of the  Jamoon");
		if(counts!=null){
			System.out.println("Jamoon Counts");
			for(int count:this.counts){
				System.out.println("Jamoon Count:"+count);
			}
		}
		else{
			System.out.println("Jammon Counts are not null");
		}
		if(ingrients!=null){
			System.out.println("Jamoon Ingrients..");
			for(Ingridient ingrient:this.ingrients){
				System.out.println("Name:"+ingrient.name);
				System.out.println("Ingridient:"+ingrient.flavor);
			}
		}
		else{
			System.out.println("Data is Invalid Check once");
		}
	}
}