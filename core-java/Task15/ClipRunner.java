class ClipRunner{
	public static void main(String[]args){
		Clip clip=new Clip();
		System.out.println("Clip Material:"+clip.material);
		System.out.println("Clip Color:"+clip.color);
		System.out.println("Clip Length:"+clip.length);
		System.out.println("Clip is Industrial:"+clip.isIndustrial);
		System.out.println("Clip Type:"+clip.type);
		
		Clip clip1=new Clip("plastic Raw Matirials","Black",3.5f,true,"Plastic");
		System.out.println("Clip Material:"+clip1.material);
		System.out.println("Clip Color:"+clip1.color);
		System.out.println("Clip Length:"+clip1.length);
		System.out.println("Clip is Industrial:"+clip1.isIndustrial);
		System.out.println("Clip Type:"+clip1.type);
		
		Clip clip2=new Clip("Raw Materials");
		System.out.println("Clip Material:"+clip2.material);
		
		
		Clip clip3=new Clip(4.5f,"Black");
		System.out.println("Clip Length:"+clip3.length);
		System.out.println("Clip Color:"+clip3.color);
		
		
		Clip clip4=new Clip("Plastic",3.7f);
		System.out.println("Clip Type:"+clip4.type);
		System.out.println("Clip Length:"+clip4.length);
		
		
		Clip clip5=new Clip(true);
		System.out.println("Clip Is Industrial:"+clip5.isIndustrial);
		
		
		
	}
}