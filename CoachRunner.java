class CoachRunner{
	public static void main(String... values){
		Tennis tennis=new Tennis();
		Badminton badminton=new Badminton();
		Cricket cricket=new Cricket();
		Kabbaddi kabbaddi = new Kabbaddi();
		FootBall footBall=new FootBall();
		Coach coach=new Coach("Girish",54,10000,"Badminton",true,tennis,badminton,cricket,kabbaddi,footBall);
		


	}
}