class IPL{
	int match;
	int teams;
	String teamName;
	boolean ipl;
	int totalMatch;
	TeamDetailes team;
	Batsman batsman;
	Boler boler;
	MatchDetails match;
	Location location;
	
	IPl(int match,int teams,String teamName,boolean ipl,int totalMatch,
	TeamDetailes team,Batsman batsman,Boler boler,MatchDetails match,Location location)
	{
		this.match=match;
		this.teams=teams;
		this.teamName=teamName;
		this.ipl=ipl;
		this.totalMatch=totalMatch;
		this.team=team;
		this.batsman=batsman;
		this.boler=boler;
		this.match=match;
		this.location=location;
		System.out.println("Succesfully Aceess ");
	}
	
}