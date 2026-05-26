public class DeveloperInformation{
    public static void main(String[] args) {
		info()
		static void info(String information){
		switch(information){
            case name:
                
                char name = "Shashank K";
                System.out.println("Developer Name:"+name);
                break;

            case age:
               
                int age = 27;
                System.out.println("Developer Age:"+age);
                break;

            case salary:
               
                double salary = 45.600;
                System.out.println("Developer Salary per Month:"+salary);
                break;

            case workingDays:
                
                byte workingDays = 5;
                System.out.println("Devloper Working Days:"+workingDays);
                break;

            case isDeveloper:
               
                boolean isDeveloper=true;
                System.out.println("Is Developer:"+isDeveloper);
                break;

            default:
                System.out.println("Invalid Information of the developer");
                break;
        }
    }
}