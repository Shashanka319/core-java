package sim;

public class SimRunner {
    public static void main(String[] args) {
        Sim sim = new Sim("Airtel",150,true);
        Sim sim1 = new Sim("Idea",150,true);
        Sim sim2= new Sim("Airtel",150,true);
        Sim sim3= new Sim("Airtel",150,false);
         boolean check = sim.equals(sim2);
        System.out.println("Check="+check);
        check = sim.name.equals(sim2.name);
        System.out.println("Check:"+check);
        check=sim.equals(sim3);
        System.out.println("Check:"+check);

    }
}
