class Parliament{
	
	int memebersCounts;
	Judge judge;
	MeetingType meetingType;
	
	Parliament(int memebersCounts, Judge judge, MeetingType meetingType){
		this.memebersCounts=memebersCounts;
		this.judge=judge;
		this.meetingType=meetingType;
	}
	
	void printInfo(){
		System.out.println("memebersCounts:" +this.memebersCounts);
		if(judge != null){
		System.out.println("judge:" + this.judge);
		}else{
			System.out.println("Judge is null..");
		}
		if(meetingType != null){
		System.out.println("meetingType:" + this.meetingType);
		}else{
			System.out.println("MeetingType is null..");
	}
}
}