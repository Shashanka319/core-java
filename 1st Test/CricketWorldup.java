class CricketWorldup{
	static void registerTeam(String teamName,String captainName,int ranking,boolean isHost,int squadSize){
		System.out.println("Team Name:"+teamName);
		System.out.println("Captain Name:"+captainName);
		System.out.println("Ranking:"+ranking);
		System.out.println("Is Host:"+isHost);
		System.out.println("Squad Size:"+squadSize);
		if(teamName==null){
			System.out.println("Data is Invalid, make a Team Name is Not Null......");
			return;
		}
		if(captainName==null){
			System.out.println("Data is Invalid, make a Team Name is Not Null.....");
			return;
		}
		if(ranking<0){
			System.out.println("Data is Invalid.....");
			return;
		}
		if(isHost==false){
			System.out.println("Data is Invalid");
			return;
		}
		if(squadSize<0){
			System.out.println("Data is Invalid....");
			return;
		}
		System.out.println("Data is Valid....");
	}
	static void saveMatch(int matchId,String team1,String team2,String venue,String city,long date,float time,int overs,boolean isDayNight,String umpire1,String umpire2){
		System.out.println("Match Id"+matchId);
		System.out.println("Team 1:"+team1);
		System.out.println("Team 2"+team2);
		System.out.println("Venue:"+venue);
		System.out.println("City"+city);
		System.out.println("Date"+date);
		System.out.println("Time:"+time);
		System.out.println("Overs"+overs);
		System.out.println("Is Day or Night"+isDayNight);
		System.out.println("Umpire 1:"+umpire1);
		System.out.println("Umpire 2"+umpire2);
		if(matchId<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(team1==null){
			System.out.println("Data is Invalid,Make a Team is Not Null...");
			return;
		}
		if(team2==null){
			System.out.println("Data is Invalid, Make a Team is Not Null");
			return;
		}
		if(venue==null){
			System.out.println("Data is Invalid, Make a Team is Not Null....");
			return;
		}
		if(city==null){
			System.out.println("Data is Invalid, Make a Team is Not Null......");
			return;
		}
		if(date<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(time<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(isDayNight==false){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(city==null){
			System.out.println("Data is Invalid, Make a Team is Not Null.....");
			return;
		}
		if(city==null){
			System.out.println("Data is Invalid, Make a Team is Not Null....");
			return;
		}
		System.out.println("Data is Valid.....");
		
	}
	static void savePlayer(String playerName,String teamName,int jerseyNumber,String role,boolean isCaptain,boolean isViceCaptain,int matchesPlayed,int runsScored,int wicktesTaken,float battingAverage,float bowlingEconomy){
		System.out.println("Player Name:"+playerName);
		System.out.println("Team Name:"+teamName);
		System.out.println("Jersey Number:"+jerseyNumber);
		System.out.println("Role:"+role);
		System.out.println("Is Capatian:"+isCaptain);
		System.out.println("Is ViceCaptain:"+isViceCaptain);
		System.out.println("Matches Played:"+matchesPlayed);
		System.out.println("Runs Scored:"+runsScored);
		System.out.println("Wicket Taken:"+wicktesTaken);
		System.out.println("Bating Average:"+battingAverage);
		System.out.println("Bowling Economy:"+bowlingEconomy);
		if(playerName==null){
			System.out.println("Data is Invalid, Make a Player Name is Not Null....");
			return;
		}
		if(teamName==null){
			System.out.println("Data is Invalid, Make a Team Name is Not Null....");
			return;
		}
		if(jerseyNumber<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(role==null){
			System.out.println("Data is Invalid, Make a Rool is Not Null....");
			return;
		}
		if(isCaptain==false){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(isViceCaptain==false){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(matchesPlayed<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(runsScored<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(wicktesTaken<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(battingAverage<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(bowlingEconomy<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		System.out.println("Data is Valid....");
		
		
	}
	static void caluclateRunRate(int totalRuns,int overFaced,boolean wicketLost){
		System.out.println("Total Runs:"+totalRuns);
		System.out.println("Over Faced:"+overFaced);
		System.out.println(" Wicket Lost:"+wicketLost);
		if(totalRuns<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		
		if(overFaced<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(wicketLost==false){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		System.out.println("Data is Valid..");
			
	}
	static void checkQualification(int points,float netRunRate,int matchesLeft){
		System.out.println("Points:"+points);
		System.out.println("NetRun Rate:"+netRunRate);
		System.out.println("matchLeft:"+matchesLeft);
		if(points<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(netRunRate<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(matchesLeft==false){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
			System.out.println("Data is Valid..");
	}
	static void manOfTheMatch(String playerName,int runs,int wickets){
		System.out.println("Player Name:"+playerName);
		System.out.println("Runs:"+runs);
		System.out.println("wickets:"+wickets);
		if(playerName==null){
			System.out.println("Data is Invalid, Make a Player Name is Not Null....");
			return;
		}
		if(runs<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		if(wickets<0){
			System.out.println("Data is Invalid Chek Once...");
			return;
		}
		System.out.println("Data is Valid..");

	}
	
}