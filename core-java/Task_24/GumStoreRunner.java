class GumStoreRunner{
	public static void main(String[] args){
		Gum gum1 = new Gum("Chiengum","Green",10,2,true,true);
		Gum gum2 = new Gum("Happydent","Green",10,3,true,true);
		Gum gum3 = new Gum("Bubble Gum","White",10,2,true,true);
		Gum gum4 = new Gum("Gum-Gum","Yellow",10,1,true,true);
		Gum gum5 = new Gum("Chiengum","Green",10,6,true,true);
		Gum gum7 = new Gum("Happydeint","White",80,5,true,false);
		Gum gum8 = new Gum("CenterFresh","Pink",30,1,true,true);
		Gum gum9 = new Gum("Happydeint","Green",10,2,true,true);
		Gum gum10 = new Gum("Bubble Gum","Green",10,7,true,true);
		Gum gum6 = new Gum("Chiengum","White",10,8,true,false);
		gum1.infoOfGum();
		Gum[] info =new Gum[10];
		GumStore stores  = new GumStore(info);
		stores.gumStore(gum1);
		
		gum2.infoOfGum();
		stores.gumStore(gum2);
		gum3.infoOfGum();
		stores.gumStore(gum3);
		gum4.infoOfGum();
		stores.gumStore(gum4);
		gum5.infoOfGum();
		stores.gumStore(gum5);
		gum6.infoOfGum();
		stores.gumStore(gum6);
		gum7.infoOfGum();
		stores.gumStore(gum7);
		gum8.infoOfGum();
		stores.gumStore(gum8);
		gum9.infoOfGum();
		stores.gumStore(gum9);
		gum10.infoOfGum();
		stores.gumStore(gum10);
	}
	
}