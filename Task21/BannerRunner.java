class BannerRunner{
	public static void main(String [] values){
		String[] types={"Small","Big","Midium"};
		BannerName[] banners=new BannerName[3];
		banners[1]=new BannerName("Students Result",3);
		banners[0]=new BannerName("Parliment",2);
		banners[2]=new BannerName("Cricket Champions",5);
		
		Banner banner=new Banner(types,banners);
		banner.getInfo();
		
	}
}