class SpectRunner {
    public static void main(String[] args) {
		Spect spect=new Spect();
		System.out.println("Spect Brand:"+spect.brand);
		System.out.println("Spect model:"+spect.model);
		System.out.println("Spect price isPolarized:"+spect.isPolarized);
		System.out.println("Spectprice:"+spect.price);
		System.out.println("SpectframeWidth:"+spect.frameWidth);
		System.out.println("Spectmaterial:"+spect.material);
		
		
		Spect spect1=new Spect("Lenscart");
		System.out.println("Spect Brand:"+spect1.brand);
		
		Spect spect2=new Spect("lenscart","highpowe Lense");
		System.out.println("Spect Brand:"+spect2.brand);
		System.out.println("Spect Model:"+spect2.model);
		
		Spect spect3=new Spect(2700);
		System.out.println("Spect Brand:"+spect3.price);
		
		Spect spect4=new Spect(true);
		System.out.println("Spect Brand:"+spect4.isPolarized);
		
		Spect spect5=new Spect(10);
		System.out.println("Spect Brand:"+spect5.frameWidth);
	}
       
}