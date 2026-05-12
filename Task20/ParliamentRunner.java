class ParliamentRunner{
	
	public static void main(String[] args){
		
		Judge judge1 = new Judge("Chief Judge");
		Judge judge2 = new Judge("Senior Judge");
		
		Parliament parliament1 = new Parliament(495, judge1, MeetingType.BUDGET);
		Parliament parliament2 = new Parliament(400, judge2, MeetingType.MONSOON);
		Parliament parliament3 = new Parliament(300, null, MeetingType.WINTER);
		Parliament parliament4 = new Parliament(600, judge1, MeetingType.SPECIAL);
		
		parliament1.printInfo();
		parliament2.printInfo();
		parliament3.printInfo();
		parliament4.printInfo();
		
	
	}
}