class Banner{
	String[] types;
	BannerName[] banners;
	
	Banner(String[] types, BannerName[] banners){
		this.types=types;
		this.banners=banners;
	}
	void getInfo(){
		System.out.println("Banner Information...");
		if(types!=null){
			System.out.println("Total Number Of Types:");
			for(String type:this.types){
				System.out.println("Banner Types:"+type);
			}
		}else{
			System.out.println("types not null...");
		}
		if(banners!=null){
			System.out.println("Total No of names of Banner");
			for(BannerName info:banners){
				System.out.println("Name:"+info.name);
				System.out.println("Count Of Banners:"+info.count);
			}
		}
		
	}
}