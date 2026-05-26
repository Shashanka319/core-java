class ComputerRunner{
	public static void main(String[] values){
		 
		Browser browser = new Browser();
		ChromBrowser chromBrowser = new ChromBrowser();
		MobileChromeBrowser mobileChromeBrowser = new MobileChromeBrowser();
		
		Computer computer = new Computer();
		computer.install(browser);
		System.out.println("Inherited the One subClass from SuperClass");
		computer.install(chromBrowser);
		System.out.println("Inherited the Two subClass from SuperClass");
		computer.install(mobileChromeBrowser);
		
	}
}