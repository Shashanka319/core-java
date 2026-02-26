class Snow{
	float snowFallDepth;
	boolean isPowder;
	String flakeType;
	double waterEqivalent;
	int visibilityRange;
	
	Snow(){}
	
	Snow(float snowFallDepth,
	boolean isPowder,
	String flakeType,
	double waterEqivalent,
	int visibilityRange){
		this.snowFallDepth=snowFallDepth;
		this.isPowder=isPowder;
		this.flakeType=flakeType;
		this.waterEqivalent=waterEqivalent;
		this.visibilityRange=visibilityRange;
	}
	
	Snow(float snowFallDepth){
		this.snowFallDepth=snowFallDepth;
	}
	
	Snow(boolean isPowder){
		this.isPowder=isPowder;
	}
	
	Snow(String flakeType){
		this.flakeType=flakeType;
	}
	
	Snow(double waterEqivalent){
		this.waterEqivalent=waterEqivalent;
	}
}
