class UnivercityRunner{
	public static void main(String[]values){
		String[] course=Univercity.getCoursesByName("Governemnt Engineering College");
		System.out.println("Courses:");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		System.out.println("<<<<<<<<<<<<<<<<<<----------------------------------------------------------------------->>>>>>>>>>>>");
		course=Univercity.getCoursesByName("IISc Bangalore");
		System.out.println("Courses:");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		System.out.println("<<<<<<<<<<<<<<<<<<----------------------------------------------------------------------->>>>>>>>>>>>");
		course=Univercity.getCoursesByName(null);
		System.out.println("Courses:");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		System.out.println("<<<<<<<<<<<<<<<<<<----------------------------------------------------------------------->>>>>>>>>>>>");
		course=Univercity.getCoursesByName("");
		System.out.println("Courses:");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>----------------------------------------------------------------------->>>>>>>>>>>>");
		course=Univercity.getCoursesByName("Governement Engineering College Challakere");
		System.out.println("Courses:");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		System.out.println("<<<<<<<<<<<<<<<<<<----------------------------------------------------------------------->>>>>>>>>>>>");
		
		course=Univercity.getCoursesByName("Governement Engineering College Chamarajanagar");
		System.out.println("Courses:");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		System.out.println("<<<<<<<<<<<<<<<<<<----------------------------------------------------------------------->>>>>>>>>>>>");
		course=Univercity.getCoursesByName("Governement Engineering College Haveri");
		System.out.println("Courses:");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		System.out.println("<<<<<<<<<<<<<<<<<<----------------------------------------------------------------------->>>>>>>>>>>>");
		course=Univercity.getCoursesByName("Governement Engineering College Davanagere");
		System.out.println("Courses:");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		System.out.println("<<<<<<<<<<<<<<<<<<----------------------------------------------------------------------->>>>>>>>>>>>");
	
		System.out.println("Courses are null...");
		
	}
}