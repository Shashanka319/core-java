class Profile{
	String name;
	String type;
	boolean streek;
	int followers;
	int post;
	boolean profilePhoto;
	
	Profile(String name,String type, boolean streek, int followers, int post, boolean profilePhoto){
		this.name=name;
		this.type=type;
		this.streek=streek;
		this.followers=followers;
		this.post=post;
		this.profilePhoto=profilePhoto;
	}
	void info(){
		System.out.println("name:"+name);
		System.out.println("type:"+type);
		System.out.println("streek:"+streek);
		System.out.println("followers:"+followers);
		System.out.println("post:"+post);
		System.out.println("profilePhoto:"+profilePhoto);
	}
	
}