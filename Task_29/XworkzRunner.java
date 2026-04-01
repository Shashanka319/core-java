class XworkzRunner{
	public static void main(String[] values){
		Students students = new Students();
		students.studentDetails();
		students.xworkzDetails();
		
		TeachingStaff teachingStaff = new TeachingStaff();
		teachingStaff.staffDetails();
		teachingStaff.xworkzDetails();
		
		FounderDetailes founderDetailes = new FounderDetailes();
		founderDetailes.details();
		founderDetailes.xworkzDetails();
	}
}