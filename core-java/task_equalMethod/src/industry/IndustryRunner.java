package industry;

public class IndustryRunner {
    public static void main(String[] args) {
        Industry industry= new Industry("Infosis","Bangalore",true);
        Industry industry1= new Industry("Infosis","Bangalore",true);
        Industry industry2= new Industry("Infosis","Bangalore",true);
        boolean check = industry.equals(industry1);
        System.out.println(check);
        check=industry.name.equals(industry1.name);
        System.out.println(check);
    }



}
