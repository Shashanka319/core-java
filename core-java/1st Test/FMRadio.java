class FMRadio{
	static void radioPlay(boolean turnOnOff){
		System.out.println("Toggle is On: "+turnOnOff);
		if(turnOnOff==false){
			System.out.println("Toggle is Off, Check Once...");
			return;
		}
		System.out.println("Toggle is On... Continue the Process");
	}
	static void setFrequency(float frequency){
		System.out.println("Radio Frequency:"+frequency);
		if(frequency<88.0){
			System.out.println("Data is Invalid Check Frequency Once");
			return;
		}
		if(frequency>108.0){
			System.out.println("Data is Invalid Check Frequency Once");
			return;
		}
		System.out.println("Data is  Valid");
	}
	static void increaseVolume(int increment) {
		System.out.println("InreaseVollume:"+increment)
        if (increment <= 0) {
            System.out.println("Data is Invalid");
			return;
        }
		if(increment>=10)
		{
			System.out.println("Data is Invalid");
			return;
		}
            System.out.println("increaseVolume: INVALID (Exceeds max 10)");
        
    }
 
    static void decreaseVolume(int decrement) {
        if (decrement 0) {
            volume -= decrement;
            System.out.println("decreaseVolume: VALID (Volume: " + volume + ")");
        } else {
            System.out.println("decreaseVolume: INVALID (Below min 0)");
        }
    }
	
	
}