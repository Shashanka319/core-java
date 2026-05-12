class President {
	static void govrn(){
		System.out.println("President is the top level in Our Country");
		System.out.println("Governer is top level in our state");
		callState();
	}
	static void callState(){
		System.out.println("President can call all states");
		rules();
	}
	static void rules(){
		System.out.println("President can order to Follow some Ruoles");
		check();
	}
	static void check(){
		System.out.println("Governer can check once those Rules and can Follow those Rules respective states");
		callAdmin();
	}
	static void callAdmin(){
		System.out.println("Governer call Admin and tell to proceed to all over state");
		collect();
	}
	static void collect(){
		System.out.println("Admin can collect those files of Rules can Proceed");
		apply();
	}
	static void apply(){
		System.out.println("After collecting those files of Rules can Apply to Citizen");
		chain();
	}
	static void chain(){
		System.out.println("Those Rules always having Chain Links");
		citizen();
	}
	static void citizen(){
		System.out.println("Citizen can Accepting those Rules");
		follow();
	}
	static void follow(){
		System.out.println("Finally all Citizen can follow Those Rules");
	}
}