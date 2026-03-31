class Computer{
	
	void install(Browser browser){
		System.out.println("Exexuting the install in Computer");
		if(browser!=null){
			browser.open();
			if(browser instanceof ChromBrowser){
				ChromBrowser chrome=(ChromBrowser) browser;
				chrome.open();
				chrome.fastOpen();
			}
	
			if(browser instanceof MobileChromeBrowser){
				MobileChromeBrowser mobile = (MobileChromeBrowser)browser;
				mobile.open();
				mobile.ofline();
			}
		}
	}
}